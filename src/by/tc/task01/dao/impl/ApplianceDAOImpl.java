package by.tc.task01.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FinderDAO;
import by.tc.task01.dao.factory.ApplianceFactory;
import by.tc.task01.dao.factory.ApplianceFactoryProvider;
import by.tc.task01.dao.parser.Parser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		List<Appliance> appliances = new ArrayList<>();

		FinderDAO finder = FileFinderDAOImpl.getInstance();

		List<String> resultsOfString;
		resultsOfString = finder.findListOfStrings(criteria);

		ApplianceFactoryProvider factoryProvider = new ApplianceFactoryProvider();
		ApplianceFactory factory = factoryProvider.takeApplianceFactory(criteria.getGroupSearchName());

		Parser parser = Parser.getInstance();

		for (int applianceIndex = 0; applianceIndex < resultsOfString.size(); applianceIndex++) {
			
			String applianceFeatures = resultsOfString.get(applianceIndex);
			
			String[] arrayOfFeatures = parser.parseToArrayOfFeatures(applianceFeatures);
			
			Appliance appliance = factory.createAppliance(arrayOfFeatures);
			appliances.add(appliance);
		}

		// you may add your own code here
		return appliances;
	}

	// you may add your own code here

}

//you may add your own new classes
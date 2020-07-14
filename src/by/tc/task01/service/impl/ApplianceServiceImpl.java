package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new ServiceException("Criteria is invalid.");
		}
		
		List <Appliance> appliances;
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		try {
		appliances = applianceDAO.find(criteria);
		}
		catch (DAOException ex) {
			throw new ServiceException();
		}
		// you may add your own code here
		
		return appliances;
	}

}

//you may add your own new classes

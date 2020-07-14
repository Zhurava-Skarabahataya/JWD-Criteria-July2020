package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws FileNotFoundException, IOException {

		List<Appliance> results;

		results = new ArrayList<>();

		String groupName = criteria.getGroupSearchName();

		Object[] searchCriteria = criteria.getCriteria().keySet().toArray();
		Object[] values = criteria.getCriteria().values().toArray();

		System.out.println(groupName);
		System.out.println(Arrays.toString(searchCriteria));
		System.out.println(Arrays.toString(values));

		String s;
		String regexForLineWithGroupName = groupName + ".+";
		String regexForLineWithCriteria;

		try (BufferedReader reader = new BufferedReader(new FileReader("resources\\appliances_db.txt"))) {

			while ((s = reader.readLine()) != null) {
				if (s.matches(regexForLineWithGroupName)) {
					boolean isLineSuits = true;
					for (int index = 0; index < values.length; index++) {
						regexForLineWithCriteria = searchCriteria[index] + "=" + values[index];
						
						if (!s.contains(regexForLineWithCriteria)) {
							isLineSuits = false;
						}
					}
					if (isLineSuits) {
						System.out.println(s);
						
					}
				}
			}
		}

		// you may add your own code here
		return null;
	}

	// you may add your own code here

}

//you may add your own new classes
package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FinderDAO;
import by.tc.task01.entity.criteria.Criteria;

//refactor me, pleeeeease

public class FileFinderDAOImpl implements FinderDAO {

	private final File file = new File("resources\\appliances_db.txt");

	private static final FinderDAO instance = new FileFinderDAOImpl();

	private FileFinderDAOImpl() {
	}

	public static FinderDAO getInstance() {
		return instance;
	}
	
	@Override
	public List<String> findListOfStrings(Criteria criteria) throws DAOException {

		List<String> results;

		results = new ArrayList<String>();

		String groupName = criteria.getGroupSearchName();

		Object[] searchCriteria = criteria.getCriteria().keySet().toArray();
		Object[] values = criteria.getCriteria().values().toArray();

		String line;
		String regexForLineWithGroupName = groupName + ".+";
		String regexForLineWithCriteria;

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			while ((line = reader.readLine()) != null) {
				if (line.matches(regexForLineWithGroupName)) {
					
					boolean isLineSuits = true;
					
					for (int index = 0; index < searchCriteria.length; index++) {
						
						regexForLineWithCriteria = searchCriteria[index] + "=" + values[index];

						if (!line.contains(regexForLineWithCriteria)) {
							isLineSuits = false;
						}
					}
					if (isLineSuits) {
						results.add(line);
					}
				}
			}
		}
		
		catch (FileNotFoundException ex ){
			throw new DAOException("Problems with file.");
		}
		catch (IOException ex) {
			throw new DAOException("Problems with reading.");
		}
		

		return results;
	}

}

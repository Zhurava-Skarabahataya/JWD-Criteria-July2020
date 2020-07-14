package by.tc.task01.dao.parser;

import by.tc.task01.dao.DAOException;

public class Parser {

	private static Parser instance = new Parser();

	private Parser() {
	}

	public static Parser getInstance() {
		return instance;
	}

	public String[] parseToArrayOfFeatures(String applianceFeatures) throws DAOException{

		if (applianceFeatures.isEmpty()) {
			throw new DAOException("Empty line:(");
		}
		
		String[] features;
		String regexForDivision = "[ :,=]+";

		features = applianceFeatures.split(regexForDivision);

		return features;
	}
}

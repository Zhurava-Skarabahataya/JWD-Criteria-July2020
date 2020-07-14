package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		if (criteria == null) {
			return false;
		}
		if (criteria.getGroupSearchName() == null) {
			return false;
		}
		if (criteria.getCriteria().isEmpty()) {
			return false;
		}
		
		return true;
	}

}

//you may add your own new classes
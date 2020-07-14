package by.tc.task01.dao;

import java.util.List;

import by.tc.task01.entity.criteria.Criteria;

public interface FinderDAO {

	List<String> findListOfStrings(Criteria criteria) throws DAOException;
	
}

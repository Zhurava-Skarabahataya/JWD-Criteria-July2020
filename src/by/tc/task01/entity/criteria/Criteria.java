package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria= new HashMap<String, Object>();;

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
		System.out.println("groupName = " + groupSearchName);
		//criteria.clear();
		System.out.println("очищено");
		for(Entry<String, Object> pair : criteria.entrySet())
        {
            Object value = pair.getValue();
            System.out.println(value);
        }
		
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	
	public Map getCriteria() {
		return criteria;
	}
	// you may add your own code here

}

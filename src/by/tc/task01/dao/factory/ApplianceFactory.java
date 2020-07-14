package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;

public interface ApplianceFactory {

	Appliance createAppliance(String features);
	
}

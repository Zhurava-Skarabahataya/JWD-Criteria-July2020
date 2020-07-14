package by.tc.task01.dao.factory;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFactoryProvider {

	private Map <ApplianceName, ApplianceFactory> appliances = new HashMap<>();
	
	public ApplianceFactoryProvider() {
		appliances.put(ApplianceName.LAPTOP, new LaptopFactory());
		appliances.put(ApplianceName.OVEN, new OvenFactory());
	}
	
	public ApplianceFactory takeApplianceFactory(String applianceFactoryName) {
		
		ApplianceName applianeName = ApplianceName.valueOf(applianceFactoryName.toUpperCase());
		ApplianceFactory factory = appliances.get(applianeName);
		return factory;
		
	}
}

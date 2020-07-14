package by.tc.task01.dao.factory;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFactoryProvider {

	private Map<ApplianceName, ApplianceFactory> appliances = new HashMap<>();

	public ApplianceFactoryProvider() { // конструктор, добавляющий в map имена приборов и их фабрики

		appliances.put(ApplianceName.LAPTOP, new LaptopFactory());
		appliances.put(ApplianceName.OVEN, new OvenFactory());
		appliances.put(ApplianceName.REFRIGERATOR, new RefrigeratorFactory());
		appliances.put(ApplianceName.SPEAKERS, new SpeakersFactory());
		appliances.put(ApplianceName.TABLETPC, new TabletPCFactory());
		appliances.put(ApplianceName.VACUUMCLEANER, new VacuumCleanerFactory());
	}

	public ApplianceFactory takeApplianceFactory(String applianceFactoryName) {

		ApplianceName applianeName;
		ApplianceFactory factory;

		applianeName = ApplianceName.valueOf(applianceFactoryName.toUpperCase());

		factory = appliances.get(applianeName);
		
		return factory;
	}
}

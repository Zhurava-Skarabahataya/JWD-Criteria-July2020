package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {
		
		int powerConsumption;
		String filterType;
		String bagType;
		String wandType;
		int motorSpeedReulation;
		int cleaningWidth;

		powerConsumption = Integer.parseInt(features[2]);
		filterType = features[4];
		bagType = features[6];
		wandType = features[8];
		motorSpeedReulation = Integer.parseInt(features[10]);
		cleaningWidth = Integer.parseInt(features[12]);

		return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedReulation, cleaningWidth);// TODO
																														// Auto-generated
																														// method
																														// stub
	}

}

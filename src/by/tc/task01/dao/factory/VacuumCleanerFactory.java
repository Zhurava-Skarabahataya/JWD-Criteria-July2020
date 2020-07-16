package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {

		VacuumCleaner vacuumCleaner = new VacuumCleaner();

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

		vacuumCleaner.setPowerConsumption(powerConsumption);
		vacuumCleaner.setFilterType(filterType);
		vacuumCleaner.setBagType(bagType);
		vacuumCleaner.setWandType(wandType);
		vacuumCleaner.setMotorSpeedReulation(motorSpeedReulation);
		vacuumCleaner.setCleaningWidth(cleaningWidth);

		return vacuumCleaner;
	}

}

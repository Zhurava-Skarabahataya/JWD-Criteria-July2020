package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

		int powerConsumption;
		String filterType;
		String bagType;
		String wandType;
		int motorSpeedReulation;
		int cleaningWidth;
		
		powerConsumption = vacuumCleaner.getPowerConsumption();
		filterType = vacuumCleaner.getFilterType();
		bagType = vacuumCleaner.getBagType();
		wandType = vacuumCleaner.getWandType();
		motorSpeedReulation = vacuumCleaner.getMotorSpeedReulation();
		cleaningWidth = vacuumCleaner.getCleaningWidth();
		
		System.out.println("VacuumCleaner\nPowerConsumption =" + powerConsumption + ", filterType =" + filterType + ", bagType ="
				+ bagType + ", wandType =" + wandType + ", motorSpeedReulation =" + motorSpeedReulation
				+ ", cleaningWidth =" + cleaningWidth);

	}

}

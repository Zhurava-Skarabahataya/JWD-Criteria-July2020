package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		Refrigerator refrigerator = (Refrigerator) appliance;

		int powerConsumption;
		int weight;
		int freezerCapacity;
		int height;
		int width;
		double overallCapacity;

		powerConsumption = refrigerator.getPowerConsumption();
		weight = refrigerator.getWeight();
		freezerCapacity = refrigerator.getFreezerCapacity();
		height = refrigerator.getHeight();
		width = refrigerator.getWidth();
		overallCapacity = refrigerator.getOverallCapacity();

		System.out.println("Refrigerator:\npowerConsumption =" + powerConsumption + ", weight =" + weight
				+ ", freezerCapacity =" + freezerCapacity + ", overallCapacity =" + overallCapacity + ", height ="
				+ height + ", width =" + width);

	}

}

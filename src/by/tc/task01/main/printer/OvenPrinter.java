package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		Oven oven = (Oven) appliance;

		int powerConsumption;
		int weight;
		int capacity;
		int depth;
		double height;
		double width;

		powerConsumption = oven.getPowerConsumption();
		weight = oven.getWeight();
		capacity = oven.getCapacity();
		depth = oven.getDepth();
		height = oven.getHeight();
		width = oven.getWidth();
		
		System.out.println("Oven:\npowerConsumption =" + powerConsumption + ", weight =" + weight + ", capacity =" + capacity
				+ ", depth =" + depth + ", height =" + height + ", width =" + width);
		
	}

}

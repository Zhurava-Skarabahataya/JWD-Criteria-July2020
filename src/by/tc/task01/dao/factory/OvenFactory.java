package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {

		int powerConsumption;
		int weight;
		int capacity;
		int depth;
		double height;
		double width;

		powerConsumption = Integer.parseInt(features[2]);
		weight = Integer.parseInt(features[4]);
		capacity = Integer.parseInt(features[6]);
		depth = Integer.parseInt(features[8]);
		height = Double.parseDouble(features[10]);
		width = Double.parseDouble(features[12]);

		return new Oven(powerConsumption, weight, capacity, depth, height, width);
	}

}

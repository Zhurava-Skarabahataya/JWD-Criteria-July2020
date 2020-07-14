package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {
		
		int powerConsumption;
		int weight;
		int freezerCapacity;
		double overallCapacity;
		int height;
		int width;

		powerConsumption = Integer.parseInt(features[2]);
		weight = Integer.parseInt(features[4]);
		freezerCapacity = Integer.parseInt(features[6]);
		overallCapacity = Double.parseDouble(features[8]);
		height = Integer.parseInt(features[10]);
		width = Integer.parseInt(features[12]);

		return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
	}

}

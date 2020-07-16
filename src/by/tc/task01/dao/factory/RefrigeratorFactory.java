package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {
		
		Refrigerator refrigerator = new Refrigerator();
		
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
		
		refrigerator.setPowerConsumption(powerConsumption);
		refrigerator.setWeight(weight);
		refrigerator.setFreezerCapacity(freezerCapacity);
		refrigerator.setOverallCapacity(overallCapacity);
		refrigerator.setHeight(height);
		refrigerator.setWidth(width);

		return refrigerator;
	}

}

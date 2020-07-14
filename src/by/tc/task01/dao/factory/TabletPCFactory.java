package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {
		
		int batteryCapacity;
		int displayInches;
		int memoryRom;
		int flashMemoryCapacity;
		String color;

		batteryCapacity = Integer.parseInt(features[2]);
		displayInches = Integer.parseInt(features[4]);
		memoryRom = Integer.parseInt(features[6]);
		flashMemoryCapacity = Integer.parseInt(features[8]);
		color = features[10];

		return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
	}

}

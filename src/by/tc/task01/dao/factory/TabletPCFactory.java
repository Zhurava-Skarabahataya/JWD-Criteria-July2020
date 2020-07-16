package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {
		
		TabletPC tabletPC = new TabletPC();
		
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

		tabletPC.setBatteryCapacity(batteryCapacity);
		tabletPC.setDisplayInches(displayInches);
		tabletPC.getMemoryRom();
		tabletPC.setFlashMemoryCapacity(flashMemoryCapacity);
		tabletPC.setColor(color);
		
		return tabletPC;
	}

}

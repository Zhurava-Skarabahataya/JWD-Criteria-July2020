package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		TabletPC tabletPC = (TabletPC) appliance;

		int batteryCapacity;
		int displayInches;
		int memoryRom;
		int flashMemoryCapacity;
		String color;

		batteryCapacity = tabletPC.getBatteryCapacity();
		displayInches = tabletPC.getDisplayInches();
		memoryRom = tabletPC.getMemoryRom();
		flashMemoryCapacity = tabletPC.getFlashMemoryCapacity();
		color = tabletPC.getColor();

		System.out.println("TabletPC:\nbatteryCapacity =" + batteryCapacity + ", displayInches =" + displayInches
				+ ", memoryRom =" + memoryRom + ", flashMemoryCapacity =" + flashMemoryCapacity + ", color =" + color);

	}

}

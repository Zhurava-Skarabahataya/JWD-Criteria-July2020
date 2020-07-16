package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		Laptop laptop = (Laptop) appliance;

		double batteryCapacity;
		String os;
		int memoryRom;
		int systemMemory;
		double cpu;
		int displayInchs;

		batteryCapacity = laptop.getBatteryCapacity();
		os = laptop.getOs();
		memoryRom = laptop.getMemoryRom();
		systemMemory = laptop.getSystemMemory();
		cpu = laptop.getCpu();
		displayInchs = laptop.getDisplayInchs();

		System.out.println("Laptop:\nbatteryCapacity = " + batteryCapacity + ", os =" + os + ", memoryRom =" + memoryRom
				+ ", systemMemory =" + systemMemory + ", cpu =" + cpu + ", displayInchs =" + displayInchs);

	}

}

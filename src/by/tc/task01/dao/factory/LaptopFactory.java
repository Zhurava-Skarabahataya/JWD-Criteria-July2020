package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {

		Laptop laptop = new Laptop();
				
		double batteryCapacity;
		String os;
		int memoryRom;
		int systemMemory;
		double cpu;
		int displayInchs;

		batteryCapacity = Double.parseDouble(features[2]);
		os = features[4];
		memoryRom = Integer.parseInt(features[6]);
		systemMemory = Integer.parseInt(features[6]);
		cpu = Double.parseDouble(features[8]);
		displayInchs = Integer.parseInt(features[12]);
		
		laptop.setBatteryCapacity(batteryCapacity);
		laptop.setOs(os);
		laptop.setMemoryRom(memoryRom);
		laptop.setSystemMemory(systemMemory);
		laptop.setCpu(cpu);
		laptop.setDisplayInchs(displayInchs);
		
		return laptop;
	}

}

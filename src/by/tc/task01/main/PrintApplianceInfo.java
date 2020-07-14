package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {
		if (appliances.isEmpty()) {
			
			System.out.println("No devices found.");
			System.out.println("------------------------------------------");

			return;
		}
		
		System.out.printf("We found %d device(s)\n", appliances.size());
		
		for (Appliance appliance : appliances) {
			System.out.println(appliance.toString());
		}
		System.out.println("------------------------------------------");
	}

	// you may add your own code here

}

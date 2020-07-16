package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.main.printer.AppliancePrinter;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {
		if (appliances.isEmpty()) {
			
			System.out.println("No devices found.");
			System.out.println("------------------------------------------");

			return;
		}
		
		System.out.printf("We found %d device(s)\n", appliances.size());
		
		PrinterProvider printerProvider = new PrinterProvider();
		
		for (Appliance appliance : appliances) {
			AppliancePrinter printer = printerProvider.takePrinter(appliance);
			printer.printApplianceInfo(appliance);
		}
		System.out.println("------------------------------------------");
	}

	// you may add your own code here

}

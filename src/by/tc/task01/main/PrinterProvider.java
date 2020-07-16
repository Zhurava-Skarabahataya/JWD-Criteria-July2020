package by.tc.task01.main;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.factory.ApplianceName;
import by.tc.task01.dao.factory.LaptopFactory;
import by.tc.task01.dao.factory.OvenFactory;
import by.tc.task01.dao.factory.RefrigeratorFactory;
import by.tc.task01.dao.factory.SpeakersFactory;
import by.tc.task01.dao.factory.TabletPCFactory;
import by.tc.task01.dao.factory.VacuumCleanerFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.main.printer.AppliancePrinter;
import by.tc.task01.main.printer.LaptopPrinter;
import by.tc.task01.main.printer.OvenPrinter;
import by.tc.task01.main.printer.RefrigeratorPrinter;
import by.tc.task01.main.printer.SpeakersPrinter;
import by.tc.task01.main.printer.TabletPCPrinter;
import by.tc.task01.main.printer.VacuumCleanerPrinter;

public class PrinterProvider {
	
	private Map <ApplianceName, AppliancePrinter> printers = new HashMap<>();
	
	public PrinterProvider() {
		printers.put(ApplianceName.LAPTOP, new LaptopPrinter());
		printers.put(ApplianceName.OVEN, new OvenPrinter());
		printers.put(ApplianceName.REFRIGERATOR, new RefrigeratorPrinter());
		printers.put(ApplianceName.SPEAKERS, new SpeakersPrinter());
		printers.put(ApplianceName.TABLETPC, new TabletPCPrinter());
		printers.put(ApplianceName.VACUUMCLEANER, new VacuumCleanerPrinter());
	}

	public AppliancePrinter takePrinter(Appliance appliance) {
		
		ApplianceName name = ApplianceName.valueOf(appliance.getClass().getSimpleName().toUpperCase());
		
		AppliancePrinter printer = printers.get(name);
		
		return printer;
		
	}
	
		
}

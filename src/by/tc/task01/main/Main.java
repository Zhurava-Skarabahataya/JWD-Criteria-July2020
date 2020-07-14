package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 32);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		System.out.println("ÕŒ¬€… «¿œ–Œ—");

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		System.out.println();
		//////////////////////////////////////////////////////////////////
		System.out.println("ÕŒ¬€… «¿œ–Œ—");
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		System.out.println(criteriaTabletPC.getGroupSearchName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}

package by.tc.task01.main.printer;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersPrinter implements AppliancePrinter {

	@Override
	public void printApplianceInfo(Appliance appliance) {

		Speakers speakers = (Speakers) appliance;

		int powerConsumption;
		int numberOfSpeakers;
		String frequencyOfRange;
		int cordLength;

		powerConsumption = speakers.getPowerConsumption();
		numberOfSpeakers = speakers.getNumberOfSpeakers();
		frequencyOfRange = speakers.getRange();
		cordLength = speakers.getCordLength();

		System.out.println("Speakers:\npowerConsumption =" + powerConsumption + ", numberOfSpeakers ="
				+ numberOfSpeakers + ", range =" + frequencyOfRange + ", cordLength =" + cordLength);

	}

}

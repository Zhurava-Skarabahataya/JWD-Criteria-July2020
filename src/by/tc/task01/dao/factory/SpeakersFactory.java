package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {

		Speakers speakers = new Speakers();
		
		int powerConsumption;
		int numberOfSpeakers;
		String frequencyOfRange;
		int cordLength;

		powerConsumption = Integer.parseInt(features[2]);
		numberOfSpeakers = Integer.parseInt(features[4]);
		frequencyOfRange = features[6];
		cordLength = Integer.parseInt(features[8]);
		
		speakers.setPowerConsumption(powerConsumption);
		speakers.setNumberOfSpeakers(numberOfSpeakers);
		speakers.setRange(frequencyOfRange);
		speakers.setCordLength(cordLength);

		return speakers;

	}

}

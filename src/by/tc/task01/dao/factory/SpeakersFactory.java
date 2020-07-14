package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersFactory implements ApplianceFactory {

	@Override
	public Appliance createAppliance(String[] features) {

		int powerConsumption;
		int numberOfSpeakers;
		String frequencyOfRange;
		int cordLength;

		powerConsumption = Integer.parseInt(features[2]);
		numberOfSpeakers = Integer.parseInt(features[4]);
		frequencyOfRange = features[6];
		cordLength = Integer.parseInt(features[8]);

		return new Speakers(powerConsumption, numberOfSpeakers, frequencyOfRange, cordLength);

	}

}

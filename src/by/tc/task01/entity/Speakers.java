package by.tc.task01.entity;

public class Speakers implements Appliance {
	private int powerConsumption;
	private int numberOfSpekers;
	private int cordLength;

	private String range;

	public Speakers(int powerConsumption, int numberOfSpekers, String range, int cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpekers = numberOfSpekers;
		this.range = range;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpekers() {
		return numberOfSpekers;
	}

	public int getCordLength() {
		return cordLength;
	}

	public String getRange() {
		return range;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cordLength;
		result = prime * result + numberOfSpekers;
		result = prime * result + powerConsumption;
		result = prime * result + ((range == null) ? 0 : range.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (numberOfSpekers != other.numberOfSpekers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (range == null) {
			if (other.range != null)
				return false;
		} else if (!range.equals(other.range))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers:\npowerConsumption =" + powerConsumption + ", numberOfSpekers =" + numberOfSpekers
				+ ", range =" + range + ", cordLength =" + cordLength + "]";
	}

}

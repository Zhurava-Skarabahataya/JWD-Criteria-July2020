package by.tc.task01.entity;

public class Speakers implements Appliance {
	private int powerConsumption;
	private int numberOfSpeakers;
	private int cordLength;

	private String range;

	public Speakers() {
	}

	public Speakers(int powerConsumption, int numberOfSpekers, String range, int cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpekers;
		this.range = range;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public int getCordLength() {
		return cordLength;
	}

	public String getRange() {
		return range;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setNumberOfSpeakers(int numberOfSpekers) {
		this.numberOfSpeakers = numberOfSpekers;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	public void setRange(String range) {
		this.range = range;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cordLength;
		result = prime * result + numberOfSpeakers;
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
		if (numberOfSpeakers != other.numberOfSpeakers)
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
		return "Speakers:\npowerConsumption =" + powerConsumption + ", numberOfSpeakers =" + numberOfSpeakers
				+ ", range =" + range + ", cordLength =" + cordLength + "]";
	}

}

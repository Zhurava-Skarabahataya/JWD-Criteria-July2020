package by.tc.task01.entity;

public class Refrigerator implements Appliance {
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int height;
	private int width;

	private double overallCapacity;

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height,
			int width) {

		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		long temp;
		temp = Double.doubleToLongBits(overallCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + width;
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator:\npowerConsumption =" + powerConsumption + ", weight =" + weight + ", freezerCapacity ="
				+ freezerCapacity + ", overallCapacity =" + overallCapacity + ", height =" + height + ", width ="
				+ width + "";
	}
}

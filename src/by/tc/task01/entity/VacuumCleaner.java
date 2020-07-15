package by.tc.task01.entity;

public class VacuumCleaner implements Appliance {
	private int PowerConsumption;
	private int motorSpeedReulation;
	private int cleaningWidth;

	private String bagType;
	private String filterType;
	private String wandType;

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedReulation, int cleaningWidth) {

		PowerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedReulation = motorSpeedReulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return PowerConsumption;
	}

	public int getMotorSpeedReulation() {
		return motorSpeedReulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public String getBagType() {
		return bagType;
	}

	public String getFilterType() {
		return filterType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setPowerConsumption(int powerConsumption) {
		PowerConsumption = powerConsumption;
	}

	public void setMotorSpeedReulation(int motorSpeedReulation) {
		this.motorSpeedReulation = motorSpeedReulation;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + PowerConsumption;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedReulation;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (PowerConsumption != other.PowerConsumption)
			return false;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedReulation != other.motorSpeedReulation)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner\nPowerConsumption =" + PowerConsumption + ", filterType =" + filterType + ", bagType ="
				+ bagType + ", wandType =" + wandType + ", motorSpeedReulation =" + motorSpeedReulation
				+ ", cleaningWidth =" + cleaningWidth + "]";
	}
}

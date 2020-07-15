package by.tc.task01.entity;

public class Laptop implements Appliance {

	private int memoryRom;
	private int systemMemory;
	private int displayInchs;

	private double batteryCapacity;
	private double cpu;

	private String os;
	
	public Laptop() {
		
	}
	
	
	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;

	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public double getCpu() {
		return cpu;
	}

	public String getOs() {
		return os;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public void setOs(String os) {
		this.os = os;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + displayInchs;
		result = prime * result + memoryRom;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop:\nbatteryCapacity = " + batteryCapacity + ", os =" + os + ", memoryRom =" + memoryRom
				+ ", systemMemory =" + systemMemory + ", cpu =" + cpu + ", displayInchs =" + displayInchs + "]";
	}

}

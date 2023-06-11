package parts;

public class Nib {

	private int inkConsumptionRate;
	private double diameter; // in mm
	
	public Nib(int inkConsumptionRate, double d) {
		this.inkConsumptionRate = inkConsumptionRate;
		this.diameter = d;
	}
	
	public int getInkConsumptionRate() {
		return inkConsumptionRate;
	}

	public double getDiameter() {
		return this.diameter;
	}
}

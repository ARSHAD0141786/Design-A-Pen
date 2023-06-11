package parts;

import exception.EmptyRefillException;

public class Refill implements Refillable {
	Ink ink;
	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	Nib nib;
	
	
	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	int capacity = 100;
	public void refill() {
		System.out.println("Replaced with new refill...");
		capacity = 100;
	}
	
	public void write(String text) throws EmptyRefillException {
		// here we can remove space from text, for calculation
		int requiredCapacity = this.nib.getInkConsumptionRate() * text.length();
		if(capacity < requiredCapacity) throw new EmptyRefillException();
		capacity -= requiredCapacity;
		
		this.ink.write(text);
	}
}

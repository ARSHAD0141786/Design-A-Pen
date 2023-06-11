package parts;

import colors.Color;
import exceptions.EmptyRefillException;

public class Ink {
	Color color;
	int capacity = 1000;
	
	public Ink(Color color) {
		this.color = color;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	// Ink cannot write without a Nib
	public void write(Nib nib, String text) throws EmptyRefillException {
		// here we can remove space from text, for calculation
		int requiredCapacity = nib.getInkConsumptionRate() * text.length();
		if(capacity < requiredCapacity) throw new EmptyRefillException("You have consumed all the ink, if you want to use it more, try refill your Pen first.");
		capacity -= requiredCapacity;
		
		System.out.println(color.getColor() + text);
		System.out.print(Color.getDefaultColor());
	}
}

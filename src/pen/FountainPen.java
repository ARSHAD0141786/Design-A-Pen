package pen;

import colors.BlueColor;
import exception.EmptyRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refillable;
import strategy.FountainPenStrategy;
import strategy.WriteStrategy;

public class FountainPen extends Pen implements Refillable {
	WriteStrategy writeStrategy;
	Ink ink;
	Nib nib;
	int capacity = 1000;
	
	
	public FountainPen() {
		this.writeStrategy = new FountainPenStrategy();
		
		ink = new Ink();
		ink.setColor(new BlueColor());
		
		nib = new Nib();
		nib.setInkConsumptionRate(this.writeStrategy.getConsumptionRate());

	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		System.out.println("Writing from Fountain pen...");
		// here we can remove space from text, for calculation
		int requiredCapacity = this.nib.getInkConsumptionRate() * text.length();
		if(capacity < requiredCapacity) throw new EmptyRefillException();
		capacity -= requiredCapacity;
		
		this.ink.write(text);

	}

	@Override
	public void refill() {
		capacity += 100;
		capacity = Math.min(capacity, 1000);
		System.out.println("Refilling fountain pen from ink pot. Capacity : " + capacity);
	}
}

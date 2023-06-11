package pen;

import exceptions.EmptyRefillException;
import exceptions.NonRefillableWithRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.FountainPenStrategy;

public class FountainPen extends Pen {
	
	private Ink ink;
	private Nib nib;
	
	public FountainPen(Ink ink, Nib nib) {
		super.writeStrategy = new FountainPenStrategy();
		this.ink = ink;
		this.nib = nib;
	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		writeStrategy.write(nib, ink, text);
	}
	
	@Override
	public void refillWithInk(Ink ink) throws EmptyRefillException {
		System.out.print("Refilling with ink : ");
		ink.write(this.nib, "####");
		this.ink = ink;
	}

	@Override
	public void refillWithRefill(Refill refill) throws NonRefillableWithRefillException {
		throw new NonRefillableWithRefillException("Fountain Pen is not refillable with refill, try put some ink from ink pot.");
	}
}

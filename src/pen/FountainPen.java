package pen;

import exception.EmptyRefillException;
import exception.NonRefillableWithRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.FountainPenStrategy;
import strategy.WriteStrategy;

public class FountainPen extends Pen {
	
	private WriteStrategy writeStrategy;
	private Ink ink;
	private Nib nib;
	
	public FountainPen(Ink ink, Nib nib) {
		this.writeStrategy = new FountainPenStrategy();
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
		throw new NonRefillableWithRefillException();
	}
}

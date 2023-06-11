package pen;

import exception.EmptyRefillException;
import exception.IncompatibeRefillException;
import exception.NonRefillableWithInkException;
import parts.Ink;
import parts.Refill;
import strategy.TrimaxAddGelStrategy;

public class GelPen extends Pen {
	Refill refill;
	
	public GelPen(Refill refill) {
		super.writeStrategy = new TrimaxAddGelStrategy();
		this.refill = refill;
	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		refill.write(writeStrategy, text);
	}
	
	@Override
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException {
		throw new NonRefillableWithInkException();
	}

	@Override
	public void refillWithRefill(Refill refill) throws IncompatibeRefillException, EmptyRefillException {
		if(this.refill.getNib().getDiameter() != refill.getNib().getDiameter()) throw new IncompatibeRefillException();
		System.out.print("Replacing with new refill, color : ");
		refill.getInk().write(refill.getNib(), "####");
		this.refill = refill;
	}

}

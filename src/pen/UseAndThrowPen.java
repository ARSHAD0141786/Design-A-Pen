package pen;

import colors.Color;
import exceptions.EmptyRefillException;
import exceptions.IncompatibeRefillException;
import exceptions.NonRefillableWithInkException;
import exceptions.NonRefillableWithRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.TrimaxAddGelStrategy;

public class UseAndThrowPen extends Pen {

	private Ink ink;
	private Nib nib;
	
	public UseAndThrowPen(Color color) {
		super.writeStrategy = new TrimaxAddGelStrategy();
		this.ink = new Ink(color);
		this.nib = new Nib(2, 1.2);
	}
	
	@Override
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException, EmptyRefillException {
		throw new NonRefillableWithInkException("Use n throw pens are not ment to refill with ink, throw this pen if you have consumed all its ink");
	}

	@Override
	public void refillWithRefill(Refill refill) throws NonRefillableWithRefillException, IncompatibeRefillException {
		throw new NonRefillableWithRefillException("Use n throw pens are not ment to refill with another refill, throw this pen if you have consumed all its ink");
		
	}

	@Override
	public void write(String text) throws EmptyRefillException {
		writeStrategy.write(nib, ink, text);
	}

}

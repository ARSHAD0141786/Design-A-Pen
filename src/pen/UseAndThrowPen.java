package pen;

import colors.Color;
import exception.EmptyRefillException;
import exception.IncompatibeRefillException;
import exception.NonRefillableWithInkException;
import exception.NonRefillableWithRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.TrimaxAddGelStrategy;
import strategy.WriteStrategy;

public class UseAndThrowPen extends Pen {

	private Ink ink;
	private Nib nib;
	private WriteStrategy writeStrategy;
	
	public UseAndThrowPen(Color color) {
		this.ink = new Ink(color);
		this.nib = new Nib(2, 1.2);
		this.writeStrategy = new TrimaxAddGelStrategy();
	}
	
	@Override
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException, EmptyRefillException {
		throw new NonRefillableWithInkException();
	}

	@Override
	public void refillWithRefill(Refill refill) throws NonRefillableWithRefillException, IncompatibeRefillException {
		throw new NonRefillableWithRefillException();
		
	}

	@Override
	public void write(String text) throws EmptyRefillException {
		writeStrategy.write(nib, ink, text);
	}

}

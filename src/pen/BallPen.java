package pen;

import exception.EmptyRefillException;
import exception.IncompatibeRefillException;
import exception.NonRefillableWithInkException;
import parts.Ink;
import parts.Refill;
import parts.RefillableBehavior;
import strategy.ButterFlowStrategy;
import strategy.WriteStrategy;

public class BallPen extends Pen implements RefillableBehavior {
	WriteStrategy writeStrategy;
	Refill refill;
	
	public BallPen(Refill refill) {
		this.writeStrategy = new ButterFlowStrategy();
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
		System.out.print("Replacing with new refill, Color : ");
		refill.getInk().write(refill.getNib(), "####");
		this.refill = refill;
	}
	
}

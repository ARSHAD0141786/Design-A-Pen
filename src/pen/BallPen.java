package pen;

import exceptions.EmptyRefillException;
import exceptions.IncompatibeRefillException;
import exceptions.NonRefillableWithInkException;
import parts.Ink;
import parts.Refill;
import parts.RefillableBehavior;
import strategy.ButterFlowStrategy;

public class BallPen extends Pen implements RefillableBehavior {
	
	Refill refill;
	
	public BallPen(Refill refill) {
		super.writeStrategy = new ButterFlowStrategy();
		this.refill = refill;
	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		refill.write(writeStrategy, text);
	}
	
	@Override
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException {
		throw new NonRefillableWithInkException("Ball Pen is not refillable with ink, try to replace its refill.");
	}

	@Override
	public void refillWithRefill(Refill refill) throws IncompatibeRefillException, EmptyRefillException {
		if(this.refill.getNib().getDiameter() != refill.getNib().getDiameter()) throw new IncompatibeRefillException("Nib diameter mismatch, refill with same diameter Nib");
		System.out.print("Replacing with new refill, Color : ");
		refill.getInk().write(refill.getNib(), "####");
		this.refill = refill;
	}
	
}

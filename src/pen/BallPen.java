package pen;

import colors.GreenColor;
import exception.EmptyRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.ButterFlowStrategy;
import strategy.WriteStrategy;

public class BallPen extends Pen {
	WriteStrategy writeStrategy;
	Refill refill;
	
	public BallPen() {
		this.writeStrategy = new ButterFlowStrategy();
		this.refill = new Refill();
		
		Ink ink = new Ink();
		ink.setColor(new GreenColor());
		this.refill.setInk(ink);
		
		Nib nib = new Nib();
		nib.setInkConsumptionRate(this.writeStrategy.getConsumptionRate());
		this.refill.setNib(nib);
	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		System.out.println("Writing from Ball pen...");
		refill.write(text);
	}
	
	public void refill() {
		this.refill.refill();
	}
	
}

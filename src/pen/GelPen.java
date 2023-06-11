package pen;

import colors.RedColor;
import exception.EmptyRefillException;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import strategy.TrimaxStrategy;
import strategy.WriteStrategy;

public class GelPen extends Pen {
	WriteStrategy writeStrategy;
	Refill refill;
	
	public GelPen() {
		this.writeStrategy = new TrimaxStrategy();
		this.refill = new Refill();
		
		Ink ink = new Ink();
		ink.setColor(new RedColor());
		this.refill.setInk(ink);
		
		Nib nib = new Nib();
		nib.setInkConsumptionRate(this.writeStrategy.getConsumptionRate());
		this.refill.setNib(nib);
	}
	
	@Override
	public void write(String text) throws EmptyRefillException {
		System.out.println("Writing from Gel pen...");
		refill.write(text);
	}

	@Override
	public void refill() {
		this.refill.refill();
	}
}

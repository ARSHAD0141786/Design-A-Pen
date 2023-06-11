package parts;

import exception.EmptyRefillException;
import strategy.WriteStrategy;

public class Refill {
	private Ink ink;
	private Nib nib;
	
	public Refill(Ink ink, Nib nib) {
		this.ink = ink;
		this.nib = nib;
	}
	
	public Nib getNib() {
		return nib;
	}
	
	public Ink getInk() {
		return ink;
	}
	
	public void write(WriteStrategy writeStrategy, String text) throws EmptyRefillException {
		writeStrategy.write(nib, ink, text);
	}
	
}

package strategy;

import exceptions.EmptyRefillException;
import parts.Ink;
import parts.Nib;

public class TrimaxAddGelStrategy implements WriteStrategy {

	@Override
	public void write(Nib nib, Ink ink, String text) throws EmptyRefillException {
		System.out.println("Writing with Trimax Add Gel strategy...");
		ink.write(nib, text);
	}
	
}

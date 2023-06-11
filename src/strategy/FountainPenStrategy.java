package strategy;

import exceptions.EmptyRefillException;
import parts.Ink;
import parts.Nib;

public class FountainPenStrategy implements WriteStrategy {

	@Override
	public void write(Nib nib, Ink ink, String text) throws EmptyRefillException {
		System.out.println("Writing with Fountain pen strategy...");
		ink.write(nib, text);
	}
	

}

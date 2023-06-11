package strategy;

import exceptions.EmptyRefillException;
import parts.Ink;
import parts.Nib;

public class ButterFlowStrategy implements WriteStrategy {

	@Override
	public void write(Nib nib, Ink ink, String text) throws EmptyRefillException {
		System.out.println("Writing with Butter flow strategy...");
		ink.write(nib, text);
	}
	
	

}

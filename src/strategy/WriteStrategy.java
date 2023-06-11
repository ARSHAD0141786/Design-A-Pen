package strategy;

import exception.EmptyRefillException;
import parts.Ink;
import parts.Nib;

public interface WriteStrategy {
	public void write(Nib nib, Ink ink, String text) throws EmptyRefillException;
}

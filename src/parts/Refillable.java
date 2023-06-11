package parts;

import exception.EmptyRefillException;

public interface Refillable {
	public void refill();
	public void write(String text) throws EmptyRefillException;
}

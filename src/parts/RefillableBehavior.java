package parts;

import exception.EmptyRefillException;
import exception.IncompatibeRefillException;
import exception.NonRefillableWithInkException;
import exception.NonRefillableWithRefillException;

public interface RefillableBehavior {
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException, EmptyRefillException;
	public void refillWithRefill(Refill refill) throws NonRefillableWithRefillException, IncompatibeRefillException, EmptyRefillException;
}

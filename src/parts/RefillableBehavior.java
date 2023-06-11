package parts;

import exceptions.EmptyRefillException;
import exceptions.IncompatibeRefillException;
import exceptions.NonRefillableWithInkException;
import exceptions.NonRefillableWithRefillException;

public interface RefillableBehavior {
	public void refillWithInk(Ink ink) throws NonRefillableWithInkException, EmptyRefillException;
	public void refillWithRefill(Refill refill) throws NonRefillableWithRefillException, IncompatibeRefillException, EmptyRefillException;
}

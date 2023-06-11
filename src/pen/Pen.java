package pen;

import exception.EmptyRefillException;

public abstract class Pen {
	String name;
	String brand;
	String price;
	public abstract void refill();
	public abstract void write(String text) throws EmptyRefillException;
}

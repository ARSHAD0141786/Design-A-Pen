package pen;

import exception.EmptyRefillException;
import parts.RefillableBehavior;

public abstract class Pen implements RefillableBehavior {
	String name;
	String brand;
	int price;
	public abstract void write(String text) throws EmptyRefillException;
}

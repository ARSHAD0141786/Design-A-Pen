package pen;

import exception.EmptyRefillException;
import parts.RefillableBehavior;
import strategy.WriteStrategy;

public abstract class Pen implements RefillableBehavior {
	String name;
	String brand;
	int price;
	WriteStrategy writeStrategy;
	public abstract void write(String text) throws EmptyRefillException;
}

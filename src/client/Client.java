package client;

import exception.EmptyRefillException;
import pen.BallPen;
import pen.FountainPen;
import pen.GelPen;
import pen.Pen;

public class Client {
	public static void main(String args[]) {
		try {
			Pen pen = new BallPen();
			pen.write("Hey There, this is Mohammed Arshad");
			pen.refill();
			
			pen = new GelPen();
			pen.write("Hey There, this is Mohammed Arshad");
			pen.refill();
			
			pen = new FountainPen();
			pen.write("Hey There, this is Mohammed Arshad");
			pen.refill();
			
		} catch (EmptyRefillException e) {
			e.printStackTrace();
		}

	}
}

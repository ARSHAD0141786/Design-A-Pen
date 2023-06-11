package client;

import colors.BlueColor;
import colors.GreenColor;
import colors.RedColor;
import parts.Ink;
import parts.Nib;
import parts.Refill;
import pen.BallPen;
import pen.FountainPen;
import pen.GelPen;
import pen.Pen;

public class Client {
	public static void main(String args[]) {
		try {
			Ink blueInk = new Ink(new BlueColor());
			Ink redInk = new Ink(new RedColor());
			Ink greenInk = new Ink(new GreenColor());
			Nib ballPenNib = new Nib(1, 1.2);
			Nib gelPenNib = new Nib(2, 2.3);
			Nib fountainPenNib = new Nib(3, 3.0);
			
			Refill blueBallPenRefill = new Refill(blueInk, ballPenNib);
			Refill redBallPenRefill = new Refill(redInk, ballPenNib);
			Refill greenGelPenRefill = new Refill(greenInk, gelPenNib);
			
			
			Pen pen = new BallPen(blueBallPenRefill);
			pen.write("Hey There, this is Mohammed Arshad");
			pen.refillWithRefill(redBallPenRefill);
			pen.write("Hey There, this is Mohammed Arshad");
			
			// pen.refillWithRefill(greenGelPenRefill); // Throws exception, refill incompatible
			
			pen = new GelPen(greenGelPenRefill);
			pen.write("Hey There, this is Mohammed Arshad");
			
			pen = new FountainPen(greenInk, fountainPenNib);
			pen.write("Hey There, this is Mohammed Arshad");
			pen.refillWithInk(blueInk);
			pen.write("Hey There, this is Mohammed Arshad");
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

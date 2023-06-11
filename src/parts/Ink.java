package parts;

import colors.Color;

public class Ink {
	Color color;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void write(String text) {
		System.out.println(color.getColor() + text);
		System.out.println(Color.getDefaultColor());
	}
}

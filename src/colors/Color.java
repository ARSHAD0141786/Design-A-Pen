package colors;

/*
+~~~~~~+~~~~~~+~~~~~~~~~~~+
|  fg  |  bg  |  color    |
+~~~~~~+~~~~~~+~~~~~~~~~~~+
|  30  |  40  |  black    |
|  31  |  41  |  red      |
|  32  |  42  |  green    |
|  33  |  43  |  yellow   |
|  34  |  44  |  blue     |
|  35  |  45  |  magenta  |
|  36  |  46  |  cyan     |
|  37  |  47  |  white    |
|  39  |  49  |  default  |
+~~~~~~+~~~~~~+~~~~~~~~~~~+
*/
public abstract class Color {
	public abstract String getColor();
	public static String getDefaultColor() {
		return "\u001B[39;49m";
	}
}
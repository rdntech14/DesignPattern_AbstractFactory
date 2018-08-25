package pattern.colors;

import pattern.AbstractFactory;
import pattern.shapes.Shape;

public class ColorFactory implements AbstractFactory {
	@Override
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if ( color.equalsIgnoreCase("Green")) {
			return new Green();
		}  else if ( color.equalsIgnoreCase("Blue")) {
			return new Blue();
		} else {
			return null;
		}
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}

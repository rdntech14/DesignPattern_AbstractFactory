package pattern.shapes;

import pattern.AbstractFactory;
import pattern.colors.Color;

public class ShapeFactory implements AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if ( shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}  else if ( shape.equalsIgnoreCase("Square")) {
			return new Square();
		} else {
			return null;
		}
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}

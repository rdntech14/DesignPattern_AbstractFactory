package pattern;

import pattern.colors.Color;
import pattern.shapes.Shape;

public interface AbstractFactory {
	Shape getShape(String shape);
	Color getColor(String color);
}

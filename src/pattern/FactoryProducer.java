package pattern;

import pattern.colors.ColorFactory;
import pattern.shapes.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryChoice) {
		if (factoryChoice.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else if (factoryChoice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		} else {
			return null;
		}

	}
}

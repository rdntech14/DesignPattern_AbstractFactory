import pattern.AbstractFactory;
import pattern.FactoryProducer;
import pattern.colors.Color;
import pattern.shapes.Shape;

public class Main {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		Shape squareShape = shapeFactory.getShape("Square");
		squareShape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color redColor = colorFactory.getColor("Red");
		redColor.fill();
	}

}

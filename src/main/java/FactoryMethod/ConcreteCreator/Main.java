package FactoryMethod.ConcreteCreator;

import FactoryMethod.model.ShapeTypes;
import FactoryMethod.model.TetrisShape;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TetrisShapeFactory factory = new TetrisShapeFactory();
        ShapeTypes[] shapeTypes = ShapeTypes.values();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            TetrisShape shape = factory.getShape(shapeTypes[random.nextInt(3)]);
            shape.rotate();
        }
    }
}

package FactoryMethod.AbstractCreator;

import FactoryMethod.AbstractCreator.factory.AbstractTetrisFactory;
import FactoryMethod.AbstractCreator.factory.TetrisBlockFactory;
import FactoryMethod.AbstractCreator.factory.TetrisHookFactory;
import FactoryMethod.AbstractCreator.factory.TetrisLineFactory;
import FactoryMethod.model.TetrisShape;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<AbstractTetrisFactory> factories = Arrays.asList(new TetrisBlockFactory(),
                new TetrisHookFactory(), new TetrisLineFactory());

        Random random = new Random();
        for(int i =0; i<5; i++) {
            TetrisShape nextShape = factories.get(random.nextInt(3)).getTetrisShape();
            nextShape.rotate();
        }
    }
}

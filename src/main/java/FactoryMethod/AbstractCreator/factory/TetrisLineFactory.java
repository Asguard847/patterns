package FactoryMethod.AbstractCreator.factory;

import FactoryMethod.AbstractCreator.factory.AbstractTetrisFactory;
import FactoryMethod.model.TetrisLine;
import FactoryMethod.model.TetrisShape;

public class TetrisLineFactory extends AbstractTetrisFactory {

    protected TetrisShape factoryMethod() {
        return new TetrisLine();
    }
}

package FactoryMethod.AbstractCreator.factory;

import FactoryMethod.AbstractCreator.factory.AbstractTetrisFactory;
import FactoryMethod.model.TetrisBlock;
import FactoryMethod.model.TetrisShape;

public class TetrisBlockFactory extends AbstractTetrisFactory {

    protected TetrisShape factoryMethod() {
        return new TetrisBlock();
    }
}

package FactoryMethod.AbstractCreator.factory;

import FactoryMethod.AbstractCreator.factory.AbstractTetrisFactory;
import FactoryMethod.model.TetrisHook;
import FactoryMethod.model.TetrisShape;

public class TetrisHookFactory extends AbstractTetrisFactory {

    protected TetrisShape factoryMethod() {
        return new TetrisHook();
    }
}

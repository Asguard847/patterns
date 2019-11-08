package FactoryMethod.AbstractCreator.factory;

import FactoryMethod.model.TetrisShape;

public abstract class AbstractTetrisFactory {

    protected abstract TetrisShape factoryMethod();

    public TetrisShape getTetrisShape(){
        return factoryMethod();
    }
}

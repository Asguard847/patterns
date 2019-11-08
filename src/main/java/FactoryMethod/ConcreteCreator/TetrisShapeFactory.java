package FactoryMethod.ConcreteCreator;

import FactoryMethod.model.*;

public class TetrisShapeFactory {

    public TetrisShape getShape(ShapeTypes type){
        switch (type){
            case BLOCK:
                return new TetrisBlock();
            case HOOK:
                return new TetrisHook();
            case LINE:
                return new TetrisLine();
            default:
                return null;
        }
    }
}

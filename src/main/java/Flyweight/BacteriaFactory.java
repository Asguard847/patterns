package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BacteriaFactory {

    private Map<BacteriaType, BacteriaInterface> bacteria = new HashMap<>();

    public BacteriaInterface getBacterium(BacteriaType type){
        BacteriaInterface bacterium = null;
        if(bacteria.containsKey(type)){
            bacterium = bacteria.get(type);
        }else{
            bacterium = new Bacterium(type);
            bacteria.put(type, bacterium);
        }
        return bacterium;
    }
}

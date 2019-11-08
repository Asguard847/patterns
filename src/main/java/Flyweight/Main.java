package Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    private Random random;
    private BacteriaFactory bacteriaFactory;
    private Map<BacteriaType, Integer> quantities;

    public static void main(String[] args) {

        Main main = new Main();
        main.executeExperiment();
    }

    private void executeExperiment() {

        bacteriaFactory = new BacteriaFactory();
        random = new Random();
        quantities = new HashMap<>();

        System.out.println("Starting our experiment.");
        System.out.println("Putting 100 bacteria of each type in nutrient.");

        bacteriaBreeding(BacteriaType.A, 100, 10);
        bacteriaBreeding(BacteriaType.B, 100, 15);
        bacteriaBreeding(BacteriaType.C, 100, 20);

        System.out.println("\nExperiment is over. After a period of time we have bacteria: ");
        System.out.println("Type A: " + quantities.get(BacteriaType.A));
        System.out.println("Type B: " + quantities.get(BacteriaType.B));
        System.out.println("Type C: " + quantities.get(BacteriaType.C));
    }

    private void bacteriaBreeding(BacteriaType type, int startQuantity, int breedingCoefficient) {

        for (int i = 0; i < startQuantity; i++){
            BacteriaInterface bacterium = bacteriaFactory.getBacterium(type);
            bacterium.setDuplications(random.nextInt(breedingCoefficient));

            quantities.merge(type, bacterium.getDuplications(), (oldVal, newVal)-> oldVal+newVal);

        }
    }
}


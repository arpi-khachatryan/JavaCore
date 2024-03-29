package classwork.patterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());

        for (int i = 0; i < 10; i++) {
            int idx = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            ItemGenerator itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();
        }
    }
}

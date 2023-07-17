package classwork.patterns.factoryMethod;

public class GoldGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}

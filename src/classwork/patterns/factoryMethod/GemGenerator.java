package classwork.patterns.factoryMethod;

public class GemGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}

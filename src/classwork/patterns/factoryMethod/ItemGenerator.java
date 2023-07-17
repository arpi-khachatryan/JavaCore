package classwork.patterns.factoryMethod;

public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();
}

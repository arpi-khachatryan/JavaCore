package classwork.patterns.decorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}


package classwork.patterns.decorator;

public class CoffeeShop {
    public static void main(String[] args) {

        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - Cost: $" + coffee.getCost());

        // Decorate the coffee with milk
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " - Cost: $" + milkCoffee.getCost());

        // Decorate the coffee with sugar
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " - Cost: $" + milkSugarCoffee.getCost());
    }
}

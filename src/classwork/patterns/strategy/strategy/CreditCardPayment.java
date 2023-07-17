package classwork.patterns.strategy.strategy;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("credit card");
    }
}

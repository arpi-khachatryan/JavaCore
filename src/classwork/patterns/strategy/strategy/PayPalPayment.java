package classwork.patterns.strategy.strategy;

public class PayPalPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("pay pal");
    }
}

package classwork.patterns.strategy.strategy;

import java.util.List;

public class PaymentService {

    private  final List<PaymentStrategy> payments;

    public PaymentService(List<PaymentStrategy> payments) {
        this.payments = payments;
    }

//    public void pay(String strategy, double amount){
//        payments.stream()
//                .filter(impl->impl.getClass().getSimpleName().equals(strategy))
//                .findFirst()
//                .isPresent(impl -> impl.pay(amount));
//    }
}

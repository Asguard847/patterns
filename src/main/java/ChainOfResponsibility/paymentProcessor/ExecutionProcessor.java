package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

public class ExecutionProcessor extends PaymentProcessor {

    @Override
    public void processPayment(PaymentOrder paymentOrder) {

        System.out.println(paymentOrder);

    }
}

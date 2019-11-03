package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

public abstract class PaymentProcessor {

    protected PaymentProcessor nextProcessor;

    public void setNextProcessor(PaymentProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public abstract void processPayment(PaymentOrder paymentOrder);

}

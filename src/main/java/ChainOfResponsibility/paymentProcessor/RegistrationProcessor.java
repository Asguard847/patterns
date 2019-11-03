package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

import java.util.List;

public class RegistrationProcessor extends PaymentProcessor {

    private List<PaymentOrder> ordersArchive;

    public RegistrationProcessor(List<PaymentOrder> ordersArchive) {
        this.ordersArchive = ordersArchive;
    }

    @Override
    public void processPayment(PaymentOrder paymentOrder) {
        ordersArchive.add(paymentOrder);
        paymentOrder.calculateTotal();
        nextProcessor.processPayment(paymentOrder);
    }

    public List<PaymentOrder> getOrdersArchive() {
        return ordersArchive;
    }
}

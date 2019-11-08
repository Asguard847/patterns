package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

public class StateTaxProcessor extends PaymentProcessor {

    private double currentTax;

    public StateTaxProcessor(double currentTax) {
        this.currentTax = currentTax;
    }

    @Override
    public void processPayment(PaymentOrder paymentOrder) {
        if (!paymentOrder.isStateTaxObliged()) {
            nextProcessor.processPayment(paymentOrder);
        }else{
            double amount = paymentOrder.getAmount();
            double stateTaxPayed = amount * (currentTax/100);
            paymentOrder.setStateTaxPayed(stateTaxPayed);
            paymentOrder.calculateTotal();
            nextProcessor.processPayment(paymentOrder);
        }
    }

    public double getCurrentTax() {
        return currentTax;
    }

    public void setCurrentTax(double currentTax) {
        this.currentTax = currentTax;
    }
}

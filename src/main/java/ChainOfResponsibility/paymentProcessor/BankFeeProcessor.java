package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

public class BankFeeProcessor extends PaymentProcessor {

    private double currentBankFee;

    public BankFeeProcessor(double currentBankFee) {
        this.currentBankFee = currentBankFee;
    }

    @Override
    public void processPayment(PaymentOrder paymentOrder) {

        if(!paymentOrder.isBankFeeObliged()){
            nextProcessor.processPayment(paymentOrder);
        }else{
            double amount = paymentOrder.getAmount();
            double bankFeePayed = amount * (currentBankFee/100);
            paymentOrder.setBankFeePayed(bankFeePayed);
            paymentOrder.calculateTotal();
            nextProcessor.processPayment(paymentOrder);
        }

    }

    public double getCurrentBankFee() {
        return currentBankFee;
    }

    public void setCurrentBankFee(double currentBankFee) {
        this.currentBankFee = currentBankFee;
    }
}

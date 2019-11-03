package ChainOfResponsibility.paymentProcessor;

import ChainOfResponsibility.PaymentOrder;

public class SecurityProcessor extends PaymentProcessor {

    @Override
    public void processPayment(PaymentOrder paymentOrder) {

        boolean sourceTrusted = paymentOrder.isSourceTrusted();
        boolean destinationTrusted = paymentOrder.isDestinationTrusted();

        if (sourceTrusted && destinationTrusted){
            nextProcessor.processPayment(paymentOrder);
            return;
        }

        boolean sourceSafe = checkSource(paymentOrder);
        boolean destinationSafe = checkDestination(paymentOrder);

        if(sourceSafe && destinationSafe){
            nextProcessor.processPayment(paymentOrder);
        }else{
            notifyPolice(paymentOrder);
        }

    }

    private boolean checkSource(PaymentOrder paymentOrder){

        boolean crimeActivities = paymentOrder.getSource().isCrimeActivities();
        boolean terroristActivities = paymentOrder.getSource().isTerroristActivities();

        return (!crimeActivities && !terroristActivities);
    }

    private boolean checkDestination(PaymentOrder paymentOrder){

        boolean crimeActivities = paymentOrder.getDestination().isCrimeActivities();
        boolean terroristActivities = paymentOrder.getDestination().isTerroristActivities();

        return (!crimeActivities && !terroristActivities);
    }

    private void notifyPolice(PaymentOrder paymentOrder){

        System.out.println("Hello officer! Payment with id " +
                paymentOrder.getId() + " requires your consideration!");

    }
}

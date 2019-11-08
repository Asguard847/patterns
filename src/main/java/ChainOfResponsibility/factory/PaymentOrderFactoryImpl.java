package ChainOfResponsibility.factory;

import ChainOfResponsibility.PaymentOrder;
import ChainOfResponsibility.PaymentOrderTypes;
import ChainOfResponsibility.PaymentActor;

import java.util.Random;

public class PaymentOrderFactoryImpl implements PaymentOrderFactory {

    Random random = new Random();

    @Override
    public PaymentOrder getPaymentOrder(PaymentOrderTypes type) {

        PaymentOrder paymentOrder = new PaymentOrder();
        paymentOrder.setAmount((random.nextInt(10)+1)*100);
        switch (type){

            case COMMON:

                paymentOrder.setStateTaxObliged(true);
                paymentOrder.setBankFeeObliged(true);
                paymentOrder.setSource(getPaymentActor());
                paymentOrder.setDestination(getPaymentActor());
                break;

            case PREFERENTIAL:

                paymentOrder.setBankFeeObliged(true);
                paymentOrder.setSource(getPaymentActor());
                paymentOrder.setDestination(getPaymentActor());
                break;

            case INNER:

                paymentOrder.setSourceTrusted(true);
                paymentOrder.setDestinationTrusted(true);
                paymentOrder.setSource(new PaymentActor());
                paymentOrder.setDestination(new PaymentActor());
                break;

            case STATE:

                paymentOrder.setSourceTrusted(true);
                paymentOrder.setDestinationTrusted(true);
                paymentOrder.setSource(new PaymentActor());
                paymentOrder.setDestination(new PaymentActor());
                paymentOrder.setBankFeeObliged(true);
                break;
        }

        return paymentOrder;
    }

    private PaymentActor getPaymentActor(){
        PaymentActor paymentActor = new PaymentActor();

        int crimeFactor = random.nextInt(10);
        if (crimeFactor == 1){
            paymentActor.setCrimeActivities(true);
        }

        int terroristFactor = random.nextInt(10);
        if(terroristFactor == 2){
            paymentActor.setTerroristActivities(true);
        }

        return paymentActor;
    }
}

package ChainOfResponsibility.factory;

import ChainOfResponsibility.PaymentOrder;
import ChainOfResponsibility.PaymentOrderTypes;

public interface PaymentOrderFactory {

    PaymentOrder getPaymentOrder(PaymentOrderTypes type);
}

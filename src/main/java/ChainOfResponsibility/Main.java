package ChainOfResponsibility;

import ChainOfResponsibility.factory.PaymentOrderFactory;
import ChainOfResponsibility.factory.PaymentOrderFactoryImpl;
import ChainOfResponsibility.paymentProcessor.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    private static final Logger LOG = Logger.getLogger(MethodHandles.lookup().lookupClass());

    private PaymentProcessor registrationProcessor;
    private PaymentProcessor securityProcessor;
    private PaymentProcessor stateTaxProcessor;
    private PaymentProcessor bankFeeProcessor;
    private PaymentProcessor executionProcessor;

    private PaymentOrderFactory paymentOrderFactory;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        Properties properties = new Properties();
        paymentOrderFactory = new PaymentOrderFactoryImpl();

        try{
            properties.load(Main.class.getResourceAsStream("/taxfee.properties"));
        }catch (IOException e){
            LOG.error("Could not read tax and fee properties from file!");
        }

        double stateTax = Double.parseDouble(properties.getProperty("STATE_TAX"));
        double bankFee = Double.parseDouble(properties.getProperty("BANK_FEE"));

        buildChainOfResponsibility(stateTax, bankFee);

        PaymentOrder common = paymentOrderFactory.getPaymentOrder(PaymentOrderTypes.COMMON);
        PaymentOrder preferential = paymentOrderFactory.getPaymentOrder(PaymentOrderTypes.PREFERENTIAL);
        PaymentOrder state = paymentOrderFactory.getPaymentOrder(PaymentOrderTypes.STATE);
        PaymentOrder inner = paymentOrderFactory.getPaymentOrder(PaymentOrderTypes.INNER);

        registrationProcessor.processPayment(common);
        registrationProcessor.processPayment(preferential);
        registrationProcessor.processPayment(state);
        registrationProcessor.processPayment(inner);

    }

    private void buildChainOfResponsibility(double stateTax, double bankFee){

        registrationProcessor = new RegistrationProcessor(new ArrayList<PaymentOrder>());
        securityProcessor = new SecurityProcessor();
        stateTaxProcessor = new StateTaxProcessor(stateTax);
        bankFeeProcessor = new BankFeeProcessor(bankFee);
        executionProcessor = new ExecutionProcessor();

        registrationProcessor.setNextProcessor(securityProcessor);
        securityProcessor.setNextProcessor(stateTaxProcessor);
        stateTaxProcessor.setNextProcessor(bankFeeProcessor);
        bankFeeProcessor.setNextProcessor(executionProcessor);

    }
}

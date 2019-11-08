package ChainOfResponsibility;

public  class PaymentOrder {

    private static int counter = 1;

    private int id;
    private double amount;
    private double stateTaxPayed;
    private double bankFeePayed;
    private double total;
    private PaymentActor source;
    private PaymentActor destination;

    private boolean sourceTrusted;
    private boolean destinationTrusted;

    private boolean stateTaxObliged;
    private boolean bankFeeObliged;

    public PaymentOrder() {
        id = counter;
        counter++;
    }

    public void calculateTotal(){
        total = amount - stateTaxPayed - bankFeePayed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getStateTaxPayed() {
        return stateTaxPayed;
    }

    public void setStateTaxPayed(double stateTaxPayed) {
        this.stateTaxPayed = stateTaxPayed;
    }

    public double getBankFeePayed() {
        return bankFeePayed;
    }

    public void setBankFeePayed(double bankFeePayed) {
        this.bankFeePayed = bankFeePayed;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public PaymentActor getSource() {
        return source;
    }

    public void setSource(PaymentActor source) {
        this.source = source;
    }

    public PaymentActor getDestination() {
        return destination;
    }

    public void setDestination(PaymentActor destination) {
        this.destination = destination;
    }

    public boolean isSourceTrusted() {
        return sourceTrusted;
    }

    public void setSourceTrusted(boolean sourceTrusted) {
        this.sourceTrusted = sourceTrusted;
    }

    public boolean isDestinationTrusted() {
        return destinationTrusted;
    }

    public void setDestinationTrusted(boolean destinationTrusted) {
        this.destinationTrusted = destinationTrusted;
    }

    public boolean isStateTaxObliged() {
        return stateTaxObliged;
    }

    public void setStateTaxObliged(boolean stateTaxObliged) {
        this.stateTaxObliged = stateTaxObliged;
    }

    public boolean isBankFeeObliged() {
        return bankFeeObliged;
    }

    public void setBankFeeObliged(boolean bankFeeObliged) {
        this.bankFeeObliged = bankFeeObliged;
    }

    @Override
    public String toString() {
        return "Payment Successful!" +
                "\nid=" + id +
                ", \namount=" + amount +
                ", \nsource=" + source +
                ", \ndestination=" + destination +
                ", \nstateTaxPayed=" + stateTaxPayed +
                ", \nbankFeePayed=" + bankFeePayed +
                ", \ntotal=" + total;
    }
}

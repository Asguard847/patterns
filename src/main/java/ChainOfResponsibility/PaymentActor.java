package ChainOfResponsibility;

public class PaymentActor {

    private boolean crimeActivities;
    private boolean terroristActivities;


    public boolean isCrimeActivities() {
        return crimeActivities;
    }

    public void setCrimeActivities(boolean crimeActivities) {
        this.crimeActivities = crimeActivities;
    }

    public boolean isTerroristActivities() {
        return terroristActivities;
    }

    public void setTerroristActivities(boolean terroristActivities) {
        this.terroristActivities = terroristActivities;
    }
}

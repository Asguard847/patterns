package Recipe;

public class Prescription {

    private String drugName;
    private int durationDays;
    private int timesPerDay;

    public Prescription(String drugName, int durationDays, int timesPerDay) {
        this.drugName = drugName;
        this.durationDays = durationDays;
        this.timesPerDay = timesPerDay;
    }

    public Prescription() {
    }

    public Prescription(Prescription prescription) {
        this.drugName = prescription.getDrugName();
        this.durationDays = prescription.getDurationDays();
        this.timesPerDay = prescription.getTimesPerDay();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public int getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(int timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "drugName='" + drugName + '\'' +
                ", durationDays=" + durationDays +
                ", timesPerDay=" + timesPerDay +
                '}';
    }
}

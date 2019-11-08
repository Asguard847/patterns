package Recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Recipe implements Cloneable {

    protected static int counter;
    protected int id;
    protected List<Prescription> prescriptions;
    protected LocalDate expirationDate;

    public Recipe() {
        prescriptions = new ArrayList<>();
        counter++;
        id = counter;
    }

    public Recipe clone() {
        Recipe recipe = null;
        try {
            recipe = (Recipe) super.clone();
            List<Prescription> clonedPrescriptions = new ArrayList<>();

            for (Prescription prescription : prescriptions) {
                Prescription clonePrescription = new Prescription(prescription);
                clonedPrescriptions.add(clonePrescription);
            }

            recipe.setPrescriptions(clonedPrescriptions);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return recipe;
    }

    public void addPrescription(Prescription prescription){
        prescriptions.add(prescription);
    }

    public int getId() {
        return id;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Recipe id: ");
        sb.append(id);
        sb.append("\n");
        for(Prescription prescription: prescriptions){
            sb.append(prescription);
            sb.append("\n");
        }
        sb.append("Expidation date: ");
        sb.append(expirationDate);
        return sb.toString();
    }
}

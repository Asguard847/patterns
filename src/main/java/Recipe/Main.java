package Recipe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    private static RecipesCache cache;

    public static void main(String[] args) {

        fillRecipesCache();

        Recipe clonedTherapystRecipe = cache.getRecipe(1).clone();
        Recipe clonedPhysicianRecipe = cache.getRecipe(2).clone();

        extendExpiration(clonedTherapystRecipe, 5);
        extendExpiration(clonedPhysicianRecipe, 7);

        System.out.println(clonedTherapystRecipe);
        System.out.println(clonedPhysicianRecipe);

    }

    private static void fillRecipesCache() {

        cache = new RecipesCache();

        Recipe therapistRecipe = new TherapistRecipe();

        Prescription prescription1 = new Prescription("therapistDrug1", 7, 2);
        Prescription prescription2 = new Prescription("therapistDrug2", 14, 2);
        Prescription prescription3 = new Prescription("therapistDrug3", 5, 3);

        therapistRecipe.addPrescription(prescription1);
        therapistRecipe.addPrescription(prescription2);
        therapistRecipe.addPrescription(prescription3);

        therapistRecipe.setExpirationDate(LocalDate.now().plus(2, ChronoUnit.WEEKS));

        Recipe physicianRecipe = new PhysicianRecipe();

        Prescription prescription4 = new Prescription("physicianDrug1", 7, 2);
        Prescription prescription5 = new Prescription("physicianDrug2", 14, 2);
        Prescription prescription6 = new Prescription("physicianDrug3", 5, 3);

        physicianRecipe.addPrescription(prescription4);
        physicianRecipe.addPrescription(prescription5);
        physicianRecipe.addPrescription(prescription6);

        physicianRecipe.setExpirationDate(LocalDate.now().plus(2, ChronoUnit.WEEKS));

        cache.addRecipe(therapistRecipe);
        cache.addRecipe(physicianRecipe);
    }

    private static void extendExpiration(Recipe recipe, int days){
        LocalDate date = recipe.getExpirationDate();
        LocalDate extendedDate = date.plus(days, ChronoUnit.DAYS);
        recipe.setExpirationDate(extendedDate);
    }
}

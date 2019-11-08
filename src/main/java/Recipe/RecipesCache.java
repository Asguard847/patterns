package Recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipesCache {

    private Map<Integer, Recipe> recipes;

    public RecipesCache() {
        recipes = new HashMap<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.put(recipe.getId(), recipe);
    }

    public Recipe getRecipe(int id){
        return recipes.get(id);
    }

    public Map<Integer, Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Map<Integer, Recipe> recipes) {
        this.recipes = recipes;
    }
}

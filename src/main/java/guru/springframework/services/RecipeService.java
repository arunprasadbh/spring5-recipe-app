package guru.springframework.services;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipe();
}

package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/*
 * Created by arunabhamidipati on 17/10/2019
 */
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }



    @Override
    public Set<Recipe> getRecipe() {
        Set<Recipe> recipes = new HashSet<>();
         recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
         return recipes;
    }
}

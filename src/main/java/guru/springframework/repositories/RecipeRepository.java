package guru.springframework.repositories;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

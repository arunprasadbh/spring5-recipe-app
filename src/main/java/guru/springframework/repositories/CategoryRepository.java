package guru.springframework.repositories;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}

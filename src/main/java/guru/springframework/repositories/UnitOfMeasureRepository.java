package guru.springframework.repositories;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}

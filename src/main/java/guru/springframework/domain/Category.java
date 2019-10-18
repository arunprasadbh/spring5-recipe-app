package guru.springframework.domain;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany
    private Set<Recipe> recipes = new HashSet<>();



}

package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/*
 * Created by arunabhamidipati on 18/10/2019
 */

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
         Long idValue = 4l;
         category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}
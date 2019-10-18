package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import guru.springframework.services.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/*
 * Created by arunabhamidipati on 18/10/2019
 */

public class IndexControllerTest {

    IndexController indexController;

    @Mock
    Model model;

    @Mock
    RecipeService recipeService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);

    }

    @Test
    public void getIndexPage() {
        String validString = "index";
        //System.out.println(indexController.getIndexPage(model));
        assertEquals(indexController.getIndexPage(model), validString);
        verify(recipeService, times(1)).getRecipe();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}
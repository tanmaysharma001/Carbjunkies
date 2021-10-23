package com.tanmay.carbjunkies.Service;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public RecipeModel saveRecipe(RecipeModel recipeModel)
    {
        recipeRepository.save(recipeModel);
        return recipeModel;
    }

    public List<RecipeModel> getAllRecipes()
    {
        return recipeRepository.findAll();
    }

    public  RecipeModel getRecipeById(int id)
    {
        return recipeRepository.getById(id);
    }
}

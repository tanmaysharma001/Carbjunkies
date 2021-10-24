package com.tanmay.carbjunkies.Controller;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipeView/{id}")
    public String getRecipe(Model model, @PathVariable("id") int id)
    {

        RecipeModel recipeModel = recipeService.getRecipeById(id);
        //System.out.println(recipeModel);
        model.addAttribute("recipeModel", recipeModel);
        return "recipeView";
    }

    @GetMapping("/recipeList")
    public String getAllRecipes(Model model)
    {
        List<RecipeModel> recipeModelList = recipeService.getAllRecipes();
        model.addAttribute("allRecipes", recipeModelList);
        //System.out.println(recipeService.getAllRecipes());
        return "recipeList";
    }

    @GetMapping("/recipeAdd")
    public String recipeAdd(Model model) {
        RecipeModel recipeModel = new RecipeModel();
        model.addAttribute("recipeModel", recipeModel);
        return "recipeAdd";
    }

    @PostMapping("/recipeAdd")
    public String saveRecipe(RecipeModel recipeModel)
    {
        recipeService.saveRecipe(recipeModel);
        return "recipeSaved";
    }

}

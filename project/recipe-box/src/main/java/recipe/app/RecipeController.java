package recipe.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.SerializationUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController("/api")
public class RecipeController {

    private List<Recipe> recipes = new ArrayList();

    private long generateId(){
        if(this.recipes.size() > 0){
            Recipe lastRecipe =  this.recipes.get(this.recipes.size() -1);
            long lastValue = lastRecipe.getId() + 1;
            System.out.println("message show" + lastValue);
        return lastValue;
        }
        return 0;
    }

    @CrossOrigin
    @RequestMapping
    public ResponseEntity getRecipes(){
        return new ResponseEntity(this.recipes , HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public  Recipe addRecipes(@RequestBody  Recipe recipe){
        long generatedId = generateId();
        recipe.setId(generatedId);
        this.recipes.add(recipe);
        System.out.println(recipe.getRecipeName() + recipe.getIngredients());
        return recipe;
    }

    @CrossOrigin
    @PutMapping
    public void updateRecipe(@RequestBody Recipe recipe){
        System.out.println("values comming in " + recipe.getRecipeName() + "id " + recipe.getId());
        for(Recipe currentRecipe: this.recipes ){
            if(currentRecipe.getId() == recipe.getId()){


                currentRecipe.setIngredients(recipe.getIngredients());
                String name = recipe.getRecipeName();
                currentRecipe.setRecipeName(name);
                System.out.println("new recipe " + currentRecipe.getIngredients() + currentRecipe.getRecipeName());
            } else{
                System.out.println("value not found");
            }
        }
    }
}

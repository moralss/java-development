package recipe.app;

public class Recipe {
    private long id;
    private String recipeName;
    private String ingredients;

    public Recipe(String recipeName, String ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
    }

    public void setId(long generatedId){
        this.id = generatedId;
    }
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }


    public long getId() {
        return this.id;
    }

}

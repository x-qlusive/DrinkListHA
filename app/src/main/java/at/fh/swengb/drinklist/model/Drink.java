package at.fh.swengb.drinklist.model;

import java.io.Serializable;

/**
 * Created by Gam0r on 29.10.2016.
 */
public class Drink implements Serializable {
    public String name;
    public String ingredients;
    public boolean containAlcohol;
    public String creator;

    public Drink(String name, String ingredients, boolean containAlcohol, String creator) {
        this.name = name;
        this.ingredients = ingredients;
        this.containAlcohol = containAlcohol;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isContainAlcohol() {
        return containAlcohol;
    }

    public void setContainAlcohol(boolean containAlcohol) {
        this.containAlcohol = containAlcohol;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", Alcohol?=" + containAlcohol +
                ", created by='" + creator + '\'' +
                '}';
    }


}

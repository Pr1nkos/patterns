package ru.pr1nkos.behavioral.template;

/**
 * The type Beverage.
 */
public abstract class Beverage {
    /**
     * Prepare recipe.
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Brew.
     */
    abstract void brew();

    /**
     * Add condiments.
     */
    abstract void addCondiments();

    /**
     * Boil water.
     */
    void boilWater(){
        System.out.println("Boiling water");
    }

    /**
     * Pour in cup.
     */
    void pourInCup(){
        System.out.println("Pour in Cup");
    }


}

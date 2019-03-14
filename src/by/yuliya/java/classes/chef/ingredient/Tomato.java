package by.yuliya.java.classes.chef.ingredient;

import by.yuliya.java.classes.chef.data.Calorie;

public class Tomato extends Vegetable {

    public Tomato(String name, double weight) {
        super(name, weight);
    }

    public double getCalories() {
        return Calorie.TOMATO_CALORIES_PER100GRAMM * super.weight / 100.0;
    }

}

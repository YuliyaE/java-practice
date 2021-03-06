package by.yuliya.java.classes.chef.ingredient;

import by.yuliya.java.classes.chef.data.Calorie;

public class Cabbage extends Vegetable {

    public Cabbage(String name, double weight) {
        super(name, weight);
    }

    public double getCalories() {
        return Calorie.CABBAGE_CALORIES_PER100GRAMM * super.weight / 100.0;
    }

}

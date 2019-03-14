package by.yuliya.java.classes.chef.ingredient;

import by.yuliya.java.classes.chef.data.Calorie;

public class Carrot extends Vegetable {

    public Carrot(String name, double weight) {
        super(name, weight);
    }

    public double getCalories() {
        return Calorie.CARROT_CALORIES_PER100GRAMM * super.weight / 100.0;
    }
}

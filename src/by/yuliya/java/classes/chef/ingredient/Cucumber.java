package by.yuliya.java.classes.chef.ingredient;

import by.yuliya.java.classes.chef.data.Calorie;

public class Cucumber extends Vegetable {

    public Cucumber(String name, double weight) {
        super(name, weight);
    }

    public double getCalories() {
        return Calorie.CUCUMBER_CALORIES_PER100GRAMM * super.weight / 100.0;
    }
}

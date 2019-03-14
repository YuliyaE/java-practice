package by.yuliya.java.classes.chef.ingredient;

import by.yuliya.java.classes.chef.data.Calorie;

public class Onion extends Vegetable {

    public Onion(String name, double weight) {
        super(name, weight);
    }

    public double getCalories() {
        return Calorie.ONION_CALORIES_PER100GRAMM * super.weight / 100.0;
    }

}

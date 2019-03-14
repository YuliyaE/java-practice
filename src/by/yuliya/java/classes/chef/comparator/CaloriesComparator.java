package by.yuliya.java.classes.chef.comparator;

import by.yuliya.java.classes.chef.ingredient.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getCalories() - v2.getCalories());
    }

}

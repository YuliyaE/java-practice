package by.yuliya.java.classes.chef.entity;

import by.yuliya.java.classes.chef.comparator.CaloriesComparator;
import by.yuliya.java.classes.chef.comparator.WeightComparator;
import by.yuliya.java.classes.chef.ingredient.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {

    private String name;

    public Salad(String name) {
        this.name = name;
    }

    public Salad() {

    }

    private List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    private boolean addVegetables(Vegetable vegetable) {
        return vegetables.add(vegetable);
    }

    private double countSaladCalories() {
        double calories = 0.0;
        for (Vegetable vegetable : vegetables) {
            calories += vegetable.getCalories();
        }
        return calories;
    }

    private double countSaladWeight() {
        double weight = 0.0;
        for (Vegetable vegetable : vegetables) {
            weight += vegetable.getWeight();
        }
        return weight;
    }

    public void sortVegetablesByWeight() {
        Collections.sort(vegetables, new CaloriesComparator());
    }

    private void sortVegetablesByCalories() {
        Collections.sort(vegetables, new WeightComparator());
    }

    private void findVegetablesByCalories(double lowCalorie, double highCalorie) {

        for (Vegetable vegetable : vegetables) {
            if (vegetable.getCalories() > lowCalorie && vegetable.getCalories() < highCalorie) {
                System.out.println(vegetable.toString());
            }
        }

    }

    public static void main(String[] args) {
        Vegetable carrot = new Carrot("Carrot", 51);
        Vegetable oneMoreCarrot = new Carrot("Carrot", 47);
        Vegetable onion = new Onion("Onion", 30);
        Vegetable cabbage = new Cabbage("Cabbage", 151);
        Vegetable tomato = new Tomato("Tomato", 300);
        Salad salad = new Salad();
        salad.addVegetables(carrot);
        salad.addVegetables(oneMoreCarrot);
        salad.addVegetables(onion);
        salad.addVegetables(cabbage);
        salad.addVegetables(tomato);
        System.out.println(salad.countSaladCalories());
        System.out.println(salad.countSaladWeight());
        System.out.println(salad.getVegetables());
        salad.sortVegetablesByCalories();
        System.out.println(salad.getVegetables());

        salad.findVegetablesByCalories(59, 160);
    }

}

package by.yuliya.java.classes.chef.ingredient;

public abstract class Vegetable {

    public String name;
    public double weight;

    Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double getCalories();

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", calories=" + getCalories() +
                ", weight=" + weight +
                '}';
    }
}

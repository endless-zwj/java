package javaLearning.SE;

public class Animal {
    String name ;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "Animal:eat");
    }

    public void sleep() {
        System.out.println(this.name + "Animal:sleep");
    }
}

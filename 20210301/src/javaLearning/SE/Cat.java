package javaLearning.SE;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name + "cat:eat");
    }

    public void cry() {
        System.out.println(this.name + "Cat:cry") ;
    }
}

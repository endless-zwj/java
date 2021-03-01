package javaLearning.SE;

public class Bird extends Animal{
     public Bird(String name) {
         super(name);
         super.eat();
     }
     public void fly() {
         System.out.println(this.name + "Bird:fly");
     }
}

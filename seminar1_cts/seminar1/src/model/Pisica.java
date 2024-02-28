package model;

public class Pisica extends Animal{
    public Pisica(String name, int age) {
        super(name, age);
    }


    public void eat(String food) {
        System.out.println("The cat " + this.getName() + " eats " + food);
    }

}

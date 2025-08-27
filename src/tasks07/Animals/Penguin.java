package tasks07.Animals;

import tasks07.HealthStatus;

public class Penguin extends Animal{

    public Penguin(String name, int age, HealthStatus healthStatus) {
        super(name, age,healthStatus);
    }
    public void makeSound(){
        System.out.println("Squawk!");
    }
}

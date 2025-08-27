package tasks07.Animals;

import tasks07.HealthStatus;

public class Lion extends Animal{

    public Lion(String name, int age, HealthStatus healthStatus) {
        super(name, age, healthStatus);
    }

    public void makeSound(){
        System.out.println("Roar!");
    }
}

package tasks07.Animals;

import tasks07.HealthStatus;

public class Zebra extends Animal{

    public Zebra(String name, int age, HealthStatus healthStatus) {
        super(name, age,healthStatus);
    }
    public void makeSound(){
        System.out.println("Neigh!");
    }
}

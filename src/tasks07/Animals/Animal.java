package tasks07.Animals;

import tasks07.HealthStatus;

public abstract class Animal {
    private  String name;
    private int age;
    private HealthStatus healthStatus;

    public Animal(String name, int age,HealthStatus healthStatus) {
        this.name = name;
        this.age = age;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public HealthStatus getHealthStatus() {
        return healthStatus;
    }
    public abstract void makeSound();

    public void eat(){

        System.out.printf("%s is eating", this.getName());
}
}

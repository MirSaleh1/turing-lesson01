package tasks07;

import tasks07.Animals.Animal;
import tasks07.Animals.ZooException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Cage<?>> cages=new ArrayList<>() ;


    public void addCage(Cage<?> cage) {
        cages.add(cage);
    }
    public void feedAllAnimals(){
        if(cages == null){
            System.out.println("No animals in cage.");
            return;
        }
        for (var cage: cages){

           for (Animal animal: cage.getAnimalInCage()){
               animal.eat();
               break;
           }
        }

    }

    public void makeAllSounds(){
        if(cages == null){
            System.out.println("No animals in cage.");
            return;
        }
        for (var cage: cages){
            for (Animal animal: cage.getAnimalInCage()){

                animal.makeSound();
                break;
            }
        }

    }

    public void checkHealth(Animal animal) throws ZooException{
       if(animal.getHealthStatus().equals(HealthStatus.HEALTHY)){
           System.out.printf("%s is healthy", animal.getName());
           return;
       }
       throw new ZooException("Animal is not healthy");

    }
}

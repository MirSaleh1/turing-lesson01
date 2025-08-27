package tasks07;

import tasks07.Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cage <T extends Animal>{
    private final List<T> animalInCage;
    private final int capacity;


    public Cage(int capacity) {
        this.capacity = capacity;
        animalInCage = new ArrayList<>();

    }

    public void addAnimal(T animal) throws ZooException {

       if (animalInCage.size() >= capacity) {
           throw new ZooException("cage is full");
       }
       animalInCage.add(animal);

    }

    public List<T> getAnimalInCage() {
        return animalInCage;
    }


    public boolean checkAnimal(T animal){
        Optional<T> animalOption= Optional.ofNullable(animal);
        if (animalOption.isPresent()){
            animal = animalOption.get();
            return true;
        }
        return false;
    }
}

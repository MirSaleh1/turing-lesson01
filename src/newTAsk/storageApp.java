package newTAsk;

public class storageApp {
    public static void main(String[] args) {
        Cat c = new Cat("bulut",2);
        Cat c2 = new Cat("karl",3);
        Cat c3 = new Cat("karn",4);
        Dog d = new Dog("Rex",3);
        Dog d2 = new Dog("flex",4);
        Dog d3 = new Dog("max",5);
        Dog d4 = new Dog("MEGATRON",2);
        Cat []cats = {c,c2,c3};
        Dog []dogs = {d,d2,d3,d4};
        Animal animal = new Animal(cats,dogs);

        animal.showAnimals();
        animal.setCat("karn");
       animal.showAnimals();
    }
}

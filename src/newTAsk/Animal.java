package newTAsk;

import java.util.Scanner;

public class Animal {
    private Cat[] cat;
    private Dog[] dog;

    public Animal(Cat[] cat, Dog[] dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public Animal() {
    }


    public void showAnimals() {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Scanner sc = new Scanner(System.in);
        int chosen = sc.nextInt();
        if (chosen == 1) {
            for (int i = 0; i < cat.length; i++) {

                cat1.name= cat[i].name;
                System.out.println("Cat name is");
                cat1.showAnimal();
            }
        } else if (chosen == 2) {
            for (int i = 0; i < dog.length; i++) {
                dog1.name = dog[i].name;
                System.out.println("Dog name is");
                dog1.showAnimal();
            }

        }

    }

    public void getCat() {
        for (int i = 0; i < cat.length; i++) {
            Cat cat1 = new Cat();
            for (int j = 0; j < cat.length; j++) {
                cat1.name = cat[j].name;
                System.out.println("Cat name is" + cat1.name);
            }

        }
    }

    public String setCat(String set) {
        Cat cat1 = new Cat();
        Scanner sc = new Scanner(System.in);

            for (int i = 0; i < cat.length; i++) {
                if (set.equals(cat[i].name)) {
                    String newName=sc.next();
                    cat[i].name=newName;
                    return cat[i].name;
                }
            }
        return null;

    }
    public String getName() {
        Cat cat1 = new Cat();
        return cat1.name ;
    }

    public void setName(String name) {
        Cat cat1 = new Cat();
        cat1.name = name;
    }

}

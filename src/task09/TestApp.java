package task09;

public class TestApp {

    public static void main(String[] args) {

      /*  Dog[] dogs = new Dog[3];

        Animal[] animals = dogs;

        Cat cat=new Cat("qiz",12,"Seref");
        Dog dog=new Dog("kisi",15,"kelbetin");
        Dog dog1=new Dog("kisi",11,"kusacka");

        animals[0]=cat;                         ISLEMIR
        animals[1]=dog;
        animals[2]=dog1;

        for (Animal animal : animals) {

            System.out.println(animal);

        }
    }

       */
        Dog[] dogs = new Dog[3];
        Object [] objects = dogs;

        Cat cat = new Cat("qiz",7,"kartoska");
        Dog dog= new Dog("qiz",17,"peleng");
        Dog dog2 = new Dog("kisi",5,"MEGATRON");


        objects[0] = cat;                                //BUDA ISLEMIR
        objects[1] = dog;
        objects[2] = dog2;

        for (Object animal : objects) {

            System.out.println(animal);

        }
    }
}

package tasks;

public class OwnApp {
    public static void main(String[] args) {

        Dog dog=new Dog("Alex",3,"pitbull");

        Man human=new Man("Saleh",19,"Kisi",dog);
        human.check();


    }
}

package newTAsk;

public class Dog  extends Animal{
    public String name;
    public int age;
    public Dog(String name,int age){
    this.name=name;
    this.age=age;
    }
    public Dog(){}
    public void showAnimal(){
        System.out.println(this.name);
    }
}

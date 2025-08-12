package newTAsk;

public class Cat  extends Animal{
    public String name;
    public int age;
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Cat() {}
    public void showAnimal(){
        System.out.println(this.name);
    }


}

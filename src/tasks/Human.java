package tasks;

public class Human  {
    private String name;
    private int age;
    private String typeof;
    Dog animal;


    public Human(String name,int age,String typeof,Dog animal){
        this.name=name;
        this.age=age;
        this.typeof=typeof;
        this.animal=animal;


    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getTypeof() {
        return typeof;
    }
    public void setTypeof(String typeof){
        this.typeof=typeof;
    }
    public String getAnimal() {
        return name;
    }
    public void setAnimal(String name){
        this.name=name;
    }

}

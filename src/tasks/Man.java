package tasks;

public class Man extends Human{
    public Man(String name,int age,String typeof,Dog animal ){
        super(name, age, typeof,animal);
    }
    public void check(){
        System.out.println("Human "+getName()+" pet is a "+animal.getType());

    }

}

package task09;

import java.util.Objects;

public class Cat extends Animal {

    private int age;
    private String name;

    public Cat(String breed,int age, String name) {
        super(breed);
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name +
                "breed="+getBreed() +
                '\''+
                '}';
    }
}

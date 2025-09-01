package task08;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Comparator<Student> {
    private String name;
    private int age;
    private static int id=0;
    private int realId=0;
    private int realRealId=0;
    private String fatherName;
    private String motherName;
    private String surname;
    private double weight;
    private double height;
    private double gpa;
    private boolean single;

    public Student(String name, int age, String fatherName, String motherName, String surname, double weight, double height, double gpa, boolean single) {
        this.name = name;
        this.age = age;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.gpa = gpa;
        this.single = single;
        id = id+1;
        realId=id;
        realRealId=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    public int getRealId() {
        return realId;
    }

    public void setRealId(int realId) {
        this.realId = realId;
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.realRealId,o.realRealId);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && realId == student.realId && Double.compare(weight, student.weight) == 0 && Double.compare(height, student.height) == 0 && Double.compare(gpa, student.gpa) == 0 && single == student.single && Objects.equals(name, student.name) && Objects.equals(fatherName, student.fatherName) && Objects.equals(motherName, student.motherName) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, realId, fatherName, motherName, surname, weight, height, gpa, single);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", realId=" + realId +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gpa=" + gpa +
                ", single=" + single +
                '}';
    }



}

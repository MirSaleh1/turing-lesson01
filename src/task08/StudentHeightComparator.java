package task08;

import java.util.Comparator;

public class StudentHeightComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return  Double.compare(o1.getHeight(), o2.getHeight());
    }



}

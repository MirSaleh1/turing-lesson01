package tasks05;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Teacher extends User {
    private String department;
    private Course[] createdCourses=new Course[5];
    private int createdCourseIndex=0;


    public  Teacher(int id, String fullName, String email, String password, String department) {
        super( id, fullName,  email, password);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void createCourse(String courseCode, String courseName) {

        if(createdCourseIndex<createdCourses.length) {
            createdCourses[createdCourseIndex++]=Course.creatCourse(courseCode, courseName, this);

        }
        else {
            System.out.println("you already have 5 courses available you can't add any more courses");
        }
    }
    public void addAssignmentToCourse(Course course,Assignment assignment) {
        boolean created = false;
        for(int i=0;i<createdCourseIndex;i++) {
            if(createdCourses[i]==course) {
                createdCourses[i].addAssignment(assignment);
                created = true;
                break;
            }

        }
        if(!created) {
            System.out.println("you don't have this course to add your assignment");
        }
    }
    public  void gradeSubmission(Submission submission,double grade) {
        submission.setGrade(grade);

    }
    public void showDashboard(){
        StringBuilder dashboard=new StringBuilder(this.getFullName());

        if(createdCourseIndex>0) {
            dashboard.append("{");
            for(int i=0;i<createdCourseIndex;i++) {
                dashboard.append(createdCourses[i].toString());
                dashboard.append(",");
            }
            dashboard.append("}");
            System.out.println(dashboard.toString());
        }else  {
            dashboard.append("{you don't have any courses }");
        }
        System.out.println(dashboard.toString());

    }public String coursesToString(){
        StringBuilder coursesString =new StringBuilder();
        String coursesStrings="you don't have any courses";

            boolean done = false;
            for (int i = 0; i < createdCourseIndex; i++) {
                coursesString.append("{");
                coursesString.append(createdCourses[i].toString());
                coursesString.append(", ");
                done = true;
            }
            coursesString.append("}");
            if (done){
                coursesStrings=coursesString.toString();
            }
            return coursesStrings;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return createdCourseIndex == teacher.createdCourseIndex && Objects.equals(department, teacher.department) && Objects.deepEquals(createdCourses, teacher.createdCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, Arrays.hashCode(createdCourses), createdCourseIndex);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", createdCourses=" + coursesToString()  +
                ", createdCourseIndex=" + createdCourseIndex +
                '}';
    }
}

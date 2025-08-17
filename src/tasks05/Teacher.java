package tasks05;

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

        }else  {
            dashboard.append("{you don't have any courses }");
        }
        System.out.println(dashboard.toString());

    }
}

package tasks05;

import java.util.Arrays;
import java.util.Objects;

public class Student extends User {
    private String studentNumber;
    private Course[] courses = new Course[5];
    private int countCourses = 0;

    public Student(int id, String fullName, String email, String password, String studentNumber) {
        super(id, fullName, email, password);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void enrolledCourses(Course course) {
        if (countCourses < courses.length) {
            courses[countCourses++] = course;
        }
    }
    public void submitAssignment(Assignment assignment,String content) {
            boolean done = false;
        for (int i=0;i<countCourses;i++) {
            if(courses[i].checkAssignment(assignment)){
                Submission task = new Submission(this, assignment, content);
                done = true;
                courses[i].addSubmission(task);
                break;
            }

        }
        if(!done){
            System.out.println("There is no such assignment");

        }

            }
    public String coursesToString() {
        StringBuilder coursesString = new StringBuilder();
        String coursesStrings = "you don't enter any courses";
        boolean done = false;
        for (int i = 0; i < countCourses; i++) {
            coursesString.append("{");
            coursesString.append(courses[i].toString());
            coursesString.append(", ");
            done = true;
        }
        coursesString.append("}");
        if (done){
            coursesStrings=coursesString.toString();
        }
        return coursesStrings;
    }

    public void showDashboard(){
        StringBuilder dashboard=new StringBuilder(this.getFullName());

        if( countCourses>0) {
            dashboard.append("{");
            for(int i=0;i< countCourses;i++) {
                dashboard.append(courses[i].toString());
                dashboard.append(",");
            }
            dashboard.append("}");

        }else  {
            dashboard.append("{you don't have any courses }");
        }
        System.out.println(dashboard.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return countCourses == student.countCourses && Objects.equals(studentNumber, student.studentNumber) && Objects.deepEquals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentNumber, Arrays.hashCode(courses), countCourses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", courses=" + coursesToString() +
                ", countCourses=" + countCourses +
                '}';
    }
}

package tasks05;

import java.util.Arrays;

public class Course {
    private String courseCode;
    private String courseName;
    private Teacher teacher;
    private Student [] students=new Student[10];
    private Assignment[] assignments=new Assignment[10];
    private Submission[] submissions=new Submission[10];
    private int studentCount=0;
    private int assigmentCount=0;
    private int submissionCount=0;

    private Course(String courseCode, String courseName, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void addStudent(Student student) {
        if (studentCount<students.length) {
            this.students[studentCount] = student;
            studentCount++;
        }else  {
            System.out.println("course is already full");
        }
    }
    public void addSubmission(Submission submission) {
        if (submissionCount<submissions.length) {
            this.submissions[submissionCount] = submission;
            submissionCount++;
        }
        else  {
            System.out.println("Assigments is already full");
        }
    }
    public void addAssignment(Assignment assignment) {
        if (assigmentCount<assignments.length) {
            this.assignments[assigmentCount] = assignment;
            assigmentCount++;
        }
        else  {
            System.out.println("Assigments is already full");
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public Assignment[] getAssignments() {
        return assignments;
    }
    public boolean checkAssignment(Assignment assignment) {
        for (int i = 0; i < assigmentCount; i++) {
            if (assignments[i]==assignment) {
                return true;
            }
        }
        return false;
    }
    public static Course creatCourse(String courseCode, String courseName, Teacher teacher) {
        Course course = new Course(courseCode, courseName, teacher);
        return course;
    }
    public String studentsToString() {
        StringBuilder studentsString = new StringBuilder();
        String studentsStrings = "this cours doesn't has students";
        boolean done = false;
        for (int i = 0; i < studentCount; i++) {
            studentsString.append("{");
            studentsString.append(students[i].toString());
            studentsString.append(", ");
            done = true;
        }
        studentsString.append("}");
        if (done){
            studentsStrings=studentsString.toString();
        }
        return studentsStrings;
    }
    public String assignmentsToString() {
        StringBuilder assignmentsString = new StringBuilder();
        String assignmentsStrings = "this cours doesn't has students";
        boolean done = false;
        for (int i = 0; i < assigmentCount; i++) {
            assignmentsString.append("{");
            assignmentsString.append(assignments[i].toString());
            assignmentsString.append(", ");
            done = true;
        }
        assignmentsString.append("}");
        if (done){
            assignmentsStrings=assignmentsString.toString();
        }
        return assignmentsStrings;
    }
    public String submissionsToString() {
        StringBuilder submissionsString = new StringBuilder();
        String submissionsStrings = "this cours doesn't has students";
        boolean done = false;
        for (int i = 0; i < submissionCount; i++) {
            submissionsString.append("{");
            submissionsString.append(submissions[i].toString());
            submissionsString.append(", ");
            done = true;
        }
        submissionsString.append("}");
        if (done){
            submissionsStrings=submissionsString.toString();
        }
        return submissionsStrings;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", students=" + studentsToString() +
                ", assignments=" + assignmentsToString() +
                ", submissions=" +  submissionsToString() +
                ", studentCount=" + studentCount +
                ", assigmentCount=" + assigmentCount +
                ", submissionCount=" + submissionCount +
                '}';
    }
}

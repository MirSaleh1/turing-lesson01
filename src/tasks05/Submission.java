package tasks05;

public class Submission {
    private Student student;
    private Assignment assignment;
    private String submissionContent;
    private double grade;

    public Submission(Student student, Assignment assignment, String submissionContent) {
        this.student = student;
        this.assignment = assignment;
        this.submissionContent = submissionContent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssigment() {
        return assignment;
    }

    public void setAssigment(Assignment assignment) {
        this.assignment = assignment;
    }

    public String getSubmissionContent() {
        return submissionContent;
    }

    public void setSubmissionContent(String submissionContent) {
        this.submissionContent = submissionContent;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
        this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100");
        }
    }
}

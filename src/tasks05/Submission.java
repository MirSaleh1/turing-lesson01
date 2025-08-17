package tasks05;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Submission that = (Submission) o;
        return Double.compare(grade, that.grade) == 0 && Objects.equals(student, that.student) && Objects.equals(assignment, that.assignment) && Objects.equals(submissionContent, that.submissionContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, assignment, submissionContent, grade);
    }

    @Override
    public String toString() {
        return "Submission{" +
                "student=" + student +
                ", assignment=" + assignment +
                ", submissionContent='" + submissionContent + '\'' +
                ", grade=" + grade +
                '}';
    }
}

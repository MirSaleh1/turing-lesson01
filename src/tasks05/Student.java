package tasks05;

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
}

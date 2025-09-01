package task08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentSortApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] students = {

                new Student("Nurlan", 20, "Tahir", "Aynur", "Məmmədov", 175, 68, 3.6, true),
                new Student("Aysel", 19, "Rəşad", "Sevinc", "Əliyeva", 165, 54, 3.9, false),
                new Student("Elvin", 22, "Ramin", "Gülnar", "Hüseynov", 180, 74, 2.8, true),
                new Student("Ləman", 21, "Zaur", "Nigar", "Quliyeva", 170, 60, 3.2, false),
                new Student("Tunar", 23, "Elçin", "Səbinə", "Əlizadə", 178, 80, 3.0, true)

        };

        boolean done = true;
        while(done){
            menu();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1: defultSort(students);
                break;
                case 2: sortByName(students);
                break;
                case 3: sortByAge(students);
                break;
                case 4: sortByHeight(students);
                break;
                case 5: randomSort(students);
                break;
                case 6: showAllStudents(students);
                    break;
                case 7:
                    System.out.println("Thank you for using our application.");
                    done = false;
                    break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
            }

        }



    }
    public static void menu(){
        System.out.println("Welcome to the Student Sorting Algorithm");
        System.out.println("1-Defult sort");
        System.out.println("2-Sort by name");
        System.out.println("3-Sort by age");
        System.out.println("4-Sort by height ");
        System.out.println("5-Random sort");
        System.out.println("6-show all students");
        System.out.println("7-Exit");
    }

    public static void sortByName(Student[] students) {

        System.out.println("do you want to sort Name for Acs or Dcsc?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Acs")) {
            Arrays.sort(students, new StudentNameComparator());

        } else if (answer.equalsIgnoreCase("Dcsc")) {

            Arrays.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
        } else {
            System.out.println("pls enter a valid answer");
        }
    }


    public static void sortByAge(Student[] students) {

        System.out.println("do you want to sort  height for Acs or Dcsc?");

        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Acs")) {
            Arrays.sort(students, new StudentAgeComparator());

        } else if (answer.equalsIgnoreCase("Dcsc")) {

            Arrays.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getAge() - o1.getAge();
                }
            });
        } else {
            System.out.println("pls enter a valid answer");
        }
    }

    public static void sortByHeight(Student[] students) {

        System.out.println("do you want to sort  height for Acs or Dcsc?");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Acs")) {

            Arrays.sort(students, new StudentHeightComparator());

        } else if (answer.equalsIgnoreCase("Dcsc")) {
            Arrays.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return Double.compare(o2.getHeight(), o1.getHeight());
                }
            });
        } else {
            System.out.println("pls enter a valid answer");
        }

    }

    public static void defultSort(Student[] students) {
        Arrays.sort(students);
        System.out.println("done");
    }

    public static void showAllStudents(Student[] students) {
        for(Student student : students){
            System.out.println(student);
        }
    }

    public static void randomSort(Student[] students) {

        boolean done = true;

        while (done) {
            System.out.println("What do you want to sort?");
            String answer = input.nextLine();

            switch (answer) {
                case "Father":
                    System.out.println("Do you want to sort  Father name for Acs or Dcsc?");
                    String answer2 = input.nextLine();
                    if (answer2.equalsIgnoreCase("Acs")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                int result = o1.getFatherName().compareToIgnoreCase(o2.getFatherName());
                                if (result == 0) {
                                    return o1.getMotherName().compareToIgnoreCase(o2.getMotherName());

                                }
                                return result;
                            }
                        });

                    } else if (answer2.equalsIgnoreCase("Dcsc")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                int result = o2.getFatherName().compareToIgnoreCase(o1.getFatherName());
                                if (result == 0) {
                                    return o2.getMotherName().compareToIgnoreCase(o1.getMotherName());

                                }
                                return result;
                            }
                        });
                    }
                    break;
                case "Gpa":
                    System.out.println("Do you want to sort  GPA for Acs or Dcsc?");
                    String answer3 = input.nextLine();
                    if (answer3.equalsIgnoreCase("Acs")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return Double.compare(o1.getGpa(), o2.getGpa());
                            }
                        });
                    } else if (answer3.equalsIgnoreCase("Dcsc")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return Double.compare(o2.getGpa(), o1.getGpa());
                            }
                        });
                    }
                    break;
                case "Weight":
                    System.out.println("Do you want to sort  Weight for Acs or Dcsc?");
                    String answer4 = input.nextLine();
                    if (answer4.equalsIgnoreCase("Acs")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return Double.compare(o1.getWeight(), o2.getWeight());
                            }
                        });
                    } else if (answer4.equalsIgnoreCase("Dcsc")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return Double.compare(o2.getWeight(), o1.getWeight());
                            }
                        });
                    }
                    break;
                case "Single":
                    System.out.println("Do you want to sort  Single for Acs or Dcsc?");
                    String answer5 = input.nextLine();
                    if (answer5.equalsIgnoreCase("Acs")) {
                        Arrays.sort(students, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return Boolean.compare(o1.isSingle(), o2.isSingle());
                            }
                        });
                    } else if (answer5.equalsIgnoreCase("Dcsc")) {
                        if (answer5.equalsIgnoreCase("Acs")) {
                            Arrays.sort(students, new Comparator<Student>() {
                                @Override
                                public int compare(Student o1, Student o2) {
                                    return Boolean.compare(o2.isSingle(), o1.isSingle());
                                }
                            });
                        }
                    }
                    break;

                case "Exit":
                    done = false;
                    break;
                default:
                    System.out.println("pls enter a valid answer");
                    break;
            }
        }

    }
}


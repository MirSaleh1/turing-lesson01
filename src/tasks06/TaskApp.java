package tasks06;

import tasks06.tasks1.DeadlineTask;
import tasks06.tasks1.Task;
import tasks06.tasks1.TaskRepository;
import tasks06.tasks1.TaskServicelmpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskRepository <Task> taskRepository = new TaskRepository<>();
        TaskServicelmpl taskServicelmpl = new TaskServicelmpl(taskRepository);
        ImmutableUser user=null;
        boolean done=false;
        while(!done){
        System.out.println("Please log in or create an account if you don't have one.");
        System.out.println("for login press one for create press two");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Please enter your  name for comfirm your login");

                String name = input.nextLine();
                for (int i=0;i<=Task.getNumberOfGlobalUsers();i++) {
                    if (Task.getGlobalUsers()[i]!=null){
                        if (Task.getGlobalUsers()[i].getName().equals(name)) {
                            user = Task.getGlobalUsers()[i];
                            done = true;
                            break;
                        }
                }
                    else  {
                        System.out.println("we don't have login");
                        break;
                    }
                }
                if(!done) {
                    System.out.println("your account does not exist");
                }
                break;
            case 2:
                System.out.println("Please enter your id and name for create new account");
                int id = input.nextInt();
                input.nextLine();
                String name1 = input.nextLine();
                ImmutableUser immutableUser = new ImmutableUser(id, name1);
                Task.globalAddUser(immutableUser);
                done=true;
                break;

            default:System.out.println("Wrong choice");break;

        }
        }


        while(done){

            menu();
            int choice = input.nextInt();
            switch(choice) {//String title, String description,  boolean isComplete
                case 1:
                    Task task=null;
                    System.out.println("Which task you want to create?");
                    System.out.println("1 Normal task\n" +
                            "2 Deadline task");
                    int choise = input.nextInt();
                    input.nextLine();
                    if(choise==1||2==choise) {
                        System.out.println("input your task id");Integer id = input.nextInt();
                        input.nextLine();
                        System.out.println("input your title");String title = input.nextLine();
                        System.out.println("input your description");String description = input.nextLine();
                        System.out.println("input your status if you done press y if you not press n");String st = input.nextLine();
                        boolean status=false;
                        if(st.equals("y")){
                            status=true;
                        }
                        else if(st.equals("n")){
                            status=false;
                        }
                        else{
                            System.out.println("Wrong choice");
                            return;
                        }
                        if(choise==1) {
                             task=new Task(id,title,description,status,user);
                        }
                        else if(choise==2) {
                            System.out.println("input your deadline time(yyyy-MM-dd HH:mm format)");

                            String time = input.nextLine();
                            LocalDateTime deadline = LocalDateTime.parse(time.replace(" ", "T"));
                                if (deadline.isBefore(LocalDateTime.now())) return;
                             task=new DeadlineTask(id,title,description,status,user,deadline);
                        }
                        taskRepository.save(task);

                    }
                    break;
                case 2:
                    System.out.println("Which task you want to see plese enter id");
                    int id = input.nextInt();
                   boolean optionalTask= taskServicelmpl.findTaskByID(id).isPresent();
                   if(optionalTask){
                       System.out.println("your task founded");
                       System.out.println(taskServicelmpl.findTaskByID(id).get());
                   }
                   else{
                       System.out.println("your task dosen't exist");
                   }
                    break;

                case 3:
                    System.out.println("Which task do want to delete?");
                    System.out.println("Please enter task id");
                    id = input.nextInt();
                    taskServicelmpl.removeTask(id);
                    break;

                case 4:
                    System.out.println("List All tasks");
                 List<Task> listTask= taskServicelmpl.listAllTasks();
                 for(Task t:listTask) {
                     System.out.println(t.toString());
                 }
                    break;

                case 5:
                    System.out.println("exit....");
                    done=false;
            }


        }
    }

    public static void menu(){
       System.out.println("\n=== Task Management System ===");
        System.out.println("1. Add Task");
        System.out.println("2. Find Task by ID");
        System.out.println("3. Delete Task by ID");
        System.out.println("4. List All Tasks");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}

package tasks06.tasks1;

import java.util.List;
import java.util.Optional;

public class TaskServicelmpl implements TaskService {

    private TaskRepository<Task>taskRepository;

    public TaskServicelmpl(TaskRepository<Task> taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void addTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void removeTask(Integer id) {

       if( findTaskByID(id).isPresent()) {
           taskRepository.deleteById(id);
       }

    }

    @Override
    public Optional<Task> findTaskByID(Integer id) {

        try{
            return taskRepository.findTaskById(id);
        }catch(TaskNotFoundException ex){

            System.out.println(ex.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public List<Task> listAllTasks() {
        return taskRepository.allTasks();
    }

    @Override
    public String toString() {
        return "TaskServicelmpl{" +
                "taskRepository=" + taskRepository +
                '}';
    }
}

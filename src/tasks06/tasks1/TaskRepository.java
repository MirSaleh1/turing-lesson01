package tasks06.tasks1;

import java.util.ArrayList;
import java.util.Optional;

public class TaskRepository<T extends Task> {
    private ArrayList<T> tasks=new ArrayList<>();

    public void save(T task) {
        tasks.add(task);
    }
    public void deleteById(Integer id) throws TaskNotFoundException {
        Optional findTask=findTaskById(id);
        System.out.println("Deleted task with id " + id);
        tasks.remove(findTask.get());


    }
    public Optional<T> findTaskById(Integer id)throws TaskNotFoundException {
        Optional<Task> optionalTask = Optional.empty();

        for (T task : tasks) {
            if (task.getId().equals(id)) {
                optionalTask = Optional.of(task);

                return (Optional<T>) optionalTask;
            }
        }
       throw new TaskNotFoundException("We could not find task with id " + id);
    }
    public ArrayList<T> allTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskRepository{" +
                "tasks=" + tasks +
                '}';
    }
}

package tasks06.tasks1;

import tasks06.ImmutableUser;

import java.time.LocalDateTime;

public class DeadlineTask extends Task {
    private LocalDateTime deadline;

    public DeadlineTask(Integer id, String title, String description,  boolean isComplete,ImmutableUser user,LocalDateTime deadline) {
      super(id, title, description, isComplete,  user);
      this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "DeadlineTask{" +
                super.toString() +
                "deadline=" + deadline +
                '}';
    }
}

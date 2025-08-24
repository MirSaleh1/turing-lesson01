package tasks06.tasks1;

import tasks06.ImmutableUser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean isComplete;
    private ImmutableUser[] users=new ImmutableUser[10];
    private int numberOfUsers=0;
    private static ImmutableUser[] globalUsers=new ImmutableUser[100];
    private static int numberOfGlobalUsers=0;

    public Task(Integer id, String title, String description,  boolean isComplete,ImmutableUser user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isComplete = isComplete;
        this.createdAt = LocalDateTime.now();
        addUser(user);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public ImmutableUser[] getUsers() {
        return users;
    }

    public static ImmutableUser[] getGlobalUsers() {
        return globalUsers;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public static int getNumberOfGlobalUsers() {
        return numberOfGlobalUsers;
    }

    public void addUser(ImmutableUser user) {
        if(numberOfUsers>=10){
            System.out.println("There are more than 10 users in this task.\n" +
                    "We could not add you.");
            return;
        }
        users[numberOfUsers]=user;
        numberOfUsers++;
    }
    public void removeUser(ImmutableUser user) {
        int index=-1;
        for(int i=0;i<numberOfUsers;i++){
            if(users[i]==user){
                index=i;
                break;
            }
        }
        if(index!=-1) {
            for(int i=index;i<numberOfUsers-1;i++){
                users[i]=users[i+1];
            }
            users[numberOfUsers-1]=null;
            numberOfUsers--;
        }
    }
    public static void globalAddUser(ImmutableUser user) {
        if(numberOfGlobalUsers>=100){
            System.out.println("There are more than 100 users in this task.\n" +
                    "We could not add you.");
            return;
        }
        globalUsers[numberOfGlobalUsers]=user;
        numberOfGlobalUsers++;
    }
    public static void removeGlobalUser(ImmutableUser user) {
        int index=-1;
        for(int i=0;i<numberOfGlobalUsers-1;i++){
            if(globalUsers[i]==user){
                index=i;
                break;
            }
        }
        if(index!=-1) {
            for(int i=index;i<numberOfGlobalUsers;i++){
                globalUsers[i]=globalUsers[i+1];
            }
            globalUsers[numberOfGlobalUsers-1]=null;
            numberOfGlobalUsers--;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isComplete == task.isComplete && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(createdAt, task.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, createdAt, isComplete);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", isComplete=" + isComplete +
                '}';
    }
}

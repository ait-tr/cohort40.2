package l34.improvisation.ex2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        Task task = new Task(title);
        this.tasks.add(task);
    }

    public Task remove(int id) {
        for (Task task: tasks) {
            if (task.getId() != id)
                continue;
            tasks.remove(task);
            return task;
        }
        return null;
    }

    public void printTasks() {
        for (Task task : this.tasks) {
            System.out.println(task);
        }
    }

    public void changeStatus(int id, TaskStatus status) {
        for (Task task : this.tasks) {
            if (task.getId() == id)
                task.setStatus(status);
        }
    }
}

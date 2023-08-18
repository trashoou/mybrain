package homework.task.dao;

import homework.task.model.Task;

public interface ToDoList {
    Task addTask();
    void removeTask();
    Task findTask();
    void printTasks();
    int quantity();
}

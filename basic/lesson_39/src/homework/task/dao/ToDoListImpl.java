package homework.task.dao;

import homework.task.model.Task;

import java.util.Scanner;

public class ToDoListImpl implements ToDoList {

    private Task[] tasks;

    int quantity;
    Scanner scanner = new Scanner(System.in);

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity]; // tasks.length = capacity
    }
    @Override
    public Task addTask() {
        if (quantity < tasks.length) {  // if the number of tasks does not exceed the size of the array, a loop is started
            System.out.println("Введите новую задачу: (id, task) ");
            int id = scanner.nextInt(); // спрашиваем id задачи у user
            scanner.nextLine();
            String taskDescription = scanner.nextLine(); // спрашиваем саму задачу у user
            Task newTask = new Task(id,taskDescription); // output for user (add task)
            tasks[quantity++] = newTask; // add +1 to the task count since the user has added one task.
            System.out.println("Задача добавлена!");
        } else {
            System.out.println("Достигнуто максимальное количество задач."); // if the number of tasks has exceeded the size of the array, we do not allow adding a new task
        }
        return null;
    }

    @Override
    public void removeTask() {

        printTasks(); // show the user a list of tasks that he added
        System.out.println("Введите номер задачи для удаления: ");
        int id = scanner.nextInt(); // input for the user to determine which task to delete

        //if the number entered by the user is greater than or = 1
        //and does not exceed the number of added tasks, run the loop
        if (id >= 1 && id <= quantity) {
            String deletedTask = String.valueOf(tasks[id - 1]);
            for (int i = id - 1; i < quantity - 1 ; i++) {
                tasks[i] = tasks[i + 1]; // replace the remote task with the task next to it on the right side
            }
            quantity--; // subtract 1 in the task count variable because the user deleted one task
            System.out.println("Задача '" + deletedTask + "' удалена.");
        } else {
            System.out.println("Недопустимый номер задачи");
        }
    }

    @Override
    public Task findTask() {
        System.out.println("Input id of task to find it.");
        int id = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            if (id == tasks[i].getId()) {
                System.out.println(tasks[i]);
                return tasks[i];
            }
        }
        System.out.println("Task not found.");
        return null;
    }

    @Override
    public void printTasks() {
        if (quantity == 0 ) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < quantity; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }

    @Override
    public int quantity() {
        return quantity();
    }
}

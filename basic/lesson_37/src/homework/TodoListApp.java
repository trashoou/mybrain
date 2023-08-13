package homework;
import java.util.Scanner;

public class TodoListApp {
    enum MenuOption {
        ADD_TASK(1),
        VIEW_TASKS(2),
        DELETE_TASK(3),
        EXIT(4);

        private final int value;

        MenuOption(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    static final int MAX_TASKS = 100; // set max number of tasks
    static String[] tasks = new String[MAX_TASKS]; // determined the size of the "tasks" array
    static int taskCount = 0; // created a variable to count tasks
    static Scanner scanner = new Scanner(System.in); // turn on Scanner

    public static void main(String[] args) {
        while(true) { // we start the loop so that the user can determine when to end the program
            System.out.println("\nTODO LIST - список дел");
            System.out.println("Меню:");
            for (MenuOption option : MenuOption.values()) { // running through the menu
                System.out.println(option.getValue()+". "+option.name().replace("_"," ").toLowerCase()); // display the menu
            }

            System.out.println("Выберите пункт меню: ");
            int choice = scanner.nextInt(); // create an output for the user (choose an option from the menu)
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Недопустимый выбор. Пожалуйста, выберите пункт из меню.");
            }
        }
    }
    static void addTask() {
        if (taskCount < MAX_TASKS) {  // if the number of tasks does not exceed the size of the array, a loop is started
            System.out.println("Введите новую задачу: ");
            String task = scanner.nextLine(); // output for user (add task)
            tasks[taskCount++] = task; // add +1 to the task count since the user has added one task.
            System.out.println("Задача добавлена!");
        } else {
            System.out.println("Достигнуто максимальное количество задач."); // if the number of tasks has exceeded the size of the array, we do not allow adding a new task
        }
    }
    static void viewTasks() { // default method to output the entire array
        if (taskCount == 0 ) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }

    static void deleteTask() {
        viewTasks(); // show the user a list of tasks that he added
        System.out.println("Введите номер задачи для удаления: ");
        int taskNumber = scanner.nextInt(); // input for the user to determine which task to delete

        //if the number entered by the user is greater than or = 1
        //and does not exceed the number of added tasks, run the loop
        if (taskNumber >= 1 && taskNumber <= taskCount) {
            String deletedTask = tasks[taskNumber - 1];
            for (int i = taskNumber - 1; i < taskCount - 1 ; i++) {
                tasks[i] = tasks[i + 1]; // replace the remote task with the task next to it on the right side
            }
            taskCount--; // subtract 1 in the task count variable because the user deleted one task
            System.out.println("Задача '" + deletedTask + "' удалена.");
        } else {
            System.out.println("Недопустимый номер задачи");
        }
    }
}

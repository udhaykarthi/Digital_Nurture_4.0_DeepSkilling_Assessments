public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();


        taskList.addTask(new Task(1, "Task One", "Pending"));
        taskList.addTask(new Task(2, "Task Two", "In Progress"));
        taskList.addTask(new Task(3, "Task Three", "Completed"));

      
        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task with ID 2:");
        taskList.searchTask(2);

       
        System.out.println("\nSearching for Task with ID 4:");
        taskList.searchTask(4);
    }
}

package org.tracy.todoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class TodoApiApplication {

    public static ArrayList<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {

        SpringApplication.run(TodoApiApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("---TO-DO List--- ");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit Program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1-> addTask(scanner);
                // case 2-> viewTask();
                case 3-> markTaskDone(scanner);
                // case 4-> deleteTask(scanner);
                case 0-> System.out.println("Good Bye!");
                default -> System.out.println("Invalid Choice!");
            }
            //until choice is not 0 (aka goodbye)
            //we are running program until then
        } while (choice !=0);
    }
    //write methods for add task and view task
    private static void addTask(Scanner scanner){
        System.out.println("Enter task: ");
        String description = scanner.nextLine();
        //use the arraylist of Task called "tasks" down here
        tasks.add(new Task(description));
        //the arraylist named "tasks" is given a new task by user
        //with a description
        System.out.println("Task added!");
    }
    //a method to view tasks
    private static void viewTasks(){
        //first check if task is empty
        if(tasks.isEmpty()){
            System.out.println("There are no tasks in the list!");

        } else {
            //create a for loop to iterate through tasks to be displayed
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    //method to mark task as done
    private static void markTaskDone(Scanner scanner){
        //do viewTasks to show tasks to the user
        viewTasks();
        //but if tasks array is empty then return and do nothing
        if(tasks.isEmpty())return;
        //then tell user to pick the number to mark as done
        System.out.println("Enter task number to mark as DONE: ");
        //then here take in the value that the user adds
        int taskNumber = scanner.nextInt();
        //also clear scanner by doing scanner.nextLine();
        scanner.nextLine();

        //now check if the task is there?
        if(taskNumber>0 && taskNumber<=tasks.size()) {
            //using arraylist, it is zero based, and we started at 0
            //so here arraylist called tasks
            //we get taskNumber 0 minus 1 which is done therefore true
            //i dont get this part
            tasks.get(taskNumber - 1).isDone = true;
            System.out.println("Task marked done successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

}

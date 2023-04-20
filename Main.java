//import java.util.concurrent.Callable;
import java.util.concurrent.Future;
//import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the MyTask class
        MyTask task = new MyTask(1);
        
        // Create a new thread and start it
        Future<Integer> future = Executors.newSingleThreadExecutor().submit(task);
        
        // Wait for the task to complete and retrieve the result
        int result = future.get();
        
        // Print the result to the console
        System.out.println("Task result: " + result);
    }
}

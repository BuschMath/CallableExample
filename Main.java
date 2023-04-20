/* The Callable interface is similar to the Runnable interface in that it is used to 
 *      define a unit of work that can be executed in a separate thread. However, the
 *      Callable interface is more powerful than Runnable because it allows the task 
 *      to return a result and throw an exception.
 */
import java.util.concurrent.Future;
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

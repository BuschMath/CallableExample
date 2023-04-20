import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
    
    private int taskId;
    
    public MyTask(int taskId) {
        this.taskId = taskId;
    }
    
    @Override
    public Integer call() throws Exception {
        // Define the code that the task will execute
        System.out.println("Task " + taskId + " is running.");
        
        // Return a value from the task
        return taskId * 2;
    }
}
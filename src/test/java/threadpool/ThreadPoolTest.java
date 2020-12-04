package threadpool;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolTest  extends TestCase {
    @Test
    public void test() {
        System.out.println("Thread Pool Test BEGIN: ");
        System.out.println("Implementing the Thread Pool...");
        List<Task> myTestList = new ArrayList<>();
        System.out.println("Task List Initiated.");
        myTestList.add(new NavigationTask(1));
        myTestList.add(new NavigationTask(2));
        myTestList.add(new NavigationTask(3));
        myTestList.add(new NavigationTask(4));
        myTestList.add(new HealthCareTask(1));
        myTestList.add(new HealthCareTask(2));
        myTestList.add(new HealthCareTask(3));
        myTestList.add(new HealthCareTask(4));
        myTestList.add(new NavigationTask(2));
        myTestList.add(new HealthCareTask(2));
        final int POOL_LIMIT = 4;
        System.out.println("The Pool Limit is " + POOL_LIMIT + ".");
        ExecutorService executor = Executors.newFixedThreadPool(POOL_LIMIT);
        myTestList.stream().map(Worker::new).forEach(executor::execute);
        executor.shutdown();
        while (!executor.isTerminated()) { Thread.yield(); }
        System.out.println("All Thread Clear.");
        System.out.println("Thread Pool Test END.");
    }
}

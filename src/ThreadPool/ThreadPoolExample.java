package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable{
    String name;
    ThreadPoolExample(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + "....Job Started by Thread" +Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
      catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "....Job Completed by Thread" +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       ThreadPoolExample[] jobs = {new ThreadPoolExample("hINAL"),new ThreadPoolExample("jinal"),new ThreadPoolExample("khayati"),new ThreadPoolExample("minal")};
       //and jobs are 4
       //total thread is 2

        ExecutorService service = Executors.newFixedThreadPool(2);
        for (ThreadPoolExample job :jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}

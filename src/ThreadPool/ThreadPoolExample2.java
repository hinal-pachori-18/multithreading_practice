package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample2 extends Thread{
    String task;
    ThreadPoolExample2(String task){
        this.task = task;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "Assign some task" +task);
    }
    public static void main(String[] args) {

        ThreadPoolExample2 t1 = new ThreadPoolExample2("COMPLETE ARRAY");
        ThreadPoolExample2 t2 = new ThreadPoolExample2("COMPLETE COLLECTION");
        ThreadPoolExample2 t3 = new ThreadPoolExample2("COMPLETE THREAD");
        ThreadPoolExample2 t4 = new ThreadPoolExample2("COMPLETE THREADPOOL");
        ThreadPoolExample2 t5 = new ThreadPoolExample2("COMPLETE SPRING");

        ExecutorService service1 = Executors.newFixedThreadPool(2);
        service1.submit(new ThreadPoolExample2("completed string"));
        service1.submit(t2);
        service1.submit(t3);
        service1.submit(t4);
//        service1.submit(t5);
        service1.shutdown();

        ExecutorService service2 = Executors.newFixedThreadPool(1);
        service2.submit(t1);
        service2.shutdown();
        }

        
        
    }


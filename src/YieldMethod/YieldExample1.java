package YieldMethod;

public class YieldExample1 extends Thread{
    public void run()
    {
      // if you want to stop the main thread and provide chance to other thread for execution
        for (int i = 0;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName() +" - "+i);
        }

    }

    public static void main(String[] args) {
        YieldExample1 yobj1 = new YieldExample1();
        Thread t =Thread.currentThread();

        yobj1.start();
        Thread.yield(); //if you want to stop the main thread and provide chance to other thread for execution
        for (int i = 0;i<5;i++){
            System.out.println("Main thread "+i);
        }

    }
}

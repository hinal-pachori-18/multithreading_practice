package DameonThread;

public class DameonThread1 extends Thread {
    public void run()  {
        System.out.println("Child thread");
    }

    public static void main(String[] args) {
        //it will throws illegalThreadStateException because main thread is already started
//        System.out.println("Main Thread");
        DameonThread1 d1 = new DameonThread1();
        d1.setDaemon(true);
        d1.start();
    }
}

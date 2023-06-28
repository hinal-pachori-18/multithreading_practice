package Testing2;

public class thread extends Thread {
    public void run()
    {
        System.out.println("thread class : "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        thread t1 = new thread();
        thread t2 = new thread();
        t1.start();
        t2.start();
        thread2 tobj = new thread2();
        tobj.threadStart();
    }
}



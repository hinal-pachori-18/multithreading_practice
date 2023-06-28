package ThreadPriority;
class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 :");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 :");
    }
}
public class PriorityExample {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

        Thread1 t1 = new Thread1();
        t1.start();

        System.out.println(t1.getPriority());
        Thread2 t2 = new Thread2();
        t2.start();
        Thread.currentThread().setPriority(1);
        t2.setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t2.getPriority());
    }

}

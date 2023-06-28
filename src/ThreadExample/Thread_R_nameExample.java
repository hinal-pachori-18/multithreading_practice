package ThreadExample;
class Myrunable implements Runnable
{
    public void run()
    {
        System.out.println("Now the thread is running");
    }
}
public class Thread_R_nameExample {
    public static void main(String[] args) {
        Myrunable m1 = new Myrunable();
        Thread t1  = new Thread(m1,"This is my Runnable thread name");
        t1.start();

        System.out.println(t1.getName());
    }
}

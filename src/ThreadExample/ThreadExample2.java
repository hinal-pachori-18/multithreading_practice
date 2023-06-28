package ThreadExample;

class ThreadEx2 extends Thread
{
    public void start()
    {
        System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("no -arg method");
    }
    public void run(int i)
    {
        System.out.println("number "+i);
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        ThreadEx2 obj2 = new ThreadEx2();
        obj2.start();
        System.out.println("Main method");
        obj2.run(10);
    }
}

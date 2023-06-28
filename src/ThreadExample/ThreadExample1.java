package ThreadExample;
class Threadex extends java.lang.Thread
{
    public void run()
    {
        for (int i = 0;i<3;i++){
            System.out.println("child thread");
        }
    }
}
public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException {
        Threadex obj1 = new Threadex();
        obj1.start();
        for (int i = 0;i<3;i++){
            System.out.println("Main thread");
        }
    }

}



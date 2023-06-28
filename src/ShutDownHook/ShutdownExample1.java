package ShutDownHook;
class thread1 extends Thread
{
    public void run()
    {
        System.out.println("tHREAD 1 STARTED");
    }
}
public class ShutdownExample1 extends Thread{
    public void run()
    {
        System.out.println("Shut down hook task completed");
    }

    public static void main(String[] args) {
        Runtime r  = Runtime.getRuntime();
        r.addShutdownHook(new ShutdownExample1());

        r.addShutdownHook(new thread1());
        r.removeShutdownHook(new ShutdownExample1());
        System.out.println("Now main sleeping... press ctrl+c to exit");
        r.removeShutdownHook(new ShutdownExample1() );
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

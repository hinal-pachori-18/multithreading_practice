package SleepMethod;

public class SleepExample1_WithoutThread {
    public static void main(String[] args) throws InterruptedException {
        //JVM WILL create main thread and Execute
        //Main method execution is pause for 6 second
        for (int i = 0; i < 6; i++) {
            try {

                Thread.sleep(6000);
                System.out.println("Main thread " + i);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

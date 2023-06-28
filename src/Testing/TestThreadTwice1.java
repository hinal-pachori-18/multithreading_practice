package Testing;

public class TestThreadTwice1 extends Thread {
    public void run()
    {
        System.out.println("Running : ");
    }

    public static void main(String[] args) {
        TestThreadTwice1 tt1 = new TestThreadTwice1();
        tt1.start();
        tt1.start();
    }
}

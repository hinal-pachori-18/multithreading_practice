package JoinMethod;

public class JoinExample2 extends Thread {
 static Thread mainthread;
    public void run() {

        try {
            mainthread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
     mainthread = Thread.currentThread();

        JoinExample2 jobj = new JoinExample2();
        jobj.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread : " + i);
            Thread.sleep(2000);
        }
    }
}

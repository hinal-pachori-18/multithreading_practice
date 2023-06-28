package SleepMethod;

public class SleepExample1_WithThread extends Thread {
    //Thread-0 will Execute
    public void run() {
        try {
            for (int j = 1; j < 5; j++) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +" : name of threads " + ", value :" + j);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //Main thread will execute
        SleepExample1_WithThread sobj1 = new SleepExample1_WithThread();
        sobj1.start();
        SleepExample1_WithThread sobj2 = new SleepExample1_WithThread();
        sobj2.run();

        for (int k = 1; k < 5; k++) {
            try {
                Thread.sleep(1000);
                System.out.println("Main thread " + k);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


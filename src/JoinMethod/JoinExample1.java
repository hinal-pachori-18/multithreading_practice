package JoinMethod;

public class JoinExample1 extends Thread {
    public void run() {

            try {
                for (int i = 1; i < 5; i++) {
                    System.out.println("Child Thread :" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }


    public static void main(String[] args) throws InterruptedException {
        JoinExample1 jobj = new JoinExample1();
        jobj.start();
        jobj.join(); //join method will stop the execution of main thread untill the finish the execution of THread-0;
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            System.out.println("Main Thread :" + i);
            Thread.sleep(1000);
        }

    }
}

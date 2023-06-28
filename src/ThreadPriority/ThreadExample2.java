package ThreadPriority;

class ThreadExample1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("CHILD THREAD 1 :" + Thread.currentThread().getName());
        }
    }
}

    class thread {
        public static void main(String[] args) throws Exception {

            //System.out.println(Thread.currentThread().getPriority());

            ThreadExample1 t2 = new ThreadExample1();
            ThreadExample1 t3 = new ThreadExample1();
            t2.setPriority(10);
            t2.start();
            t3.setPriority(9);
            t3.start();
            for (int i = 0; i < 5; i++) {

                System.out.println("MAIN THREAD");
            }
        }
    }

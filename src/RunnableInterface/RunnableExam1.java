package RunnableInterface;
class RunExample implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("child thread");
        }
    }
}
public class RunnableExam1 {
    public static void main(String[] args) throws InterruptedException {
        RunExample object1 = new RunExample();
        Thread t = new Thread(object1);
        t.join();
        t.start();
        System.out.println("Main thread");
    }
}

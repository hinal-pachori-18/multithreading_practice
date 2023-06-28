package Testing2;

public class thread2 extends Thread{


    thread t3 = new thread();
    thread t4 = new thread();
    public void threadStart(){
        t3.start();
        t4.start();
    }

}

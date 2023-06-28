package Testing;

public class TestCallRun1 extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        for (int i = 0;i<5;i++){
         System.out.println(i);
     }
    }

    public static void main(String[] args) {
        TestCallRun1 t2 = new TestCallRun1();
        TestCallRun1 t3 = new TestCallRun1();
        t2.start();
        t3.start();
    }
}

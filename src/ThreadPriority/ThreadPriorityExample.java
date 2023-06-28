package ThreadPriority;

public class ThreadPriorityExample extends Thread{
    public void run(){
        System.out.println("Inside in the run Method");

    }

    public static void main(String[] args) {
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();
        //display the priority of thread.
        //using the getPriority method.
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());
        // Setting priorities of above threads by
        // passing integer arguments
        th1.setPriority(10);
        th2.setPriority(4);
        th3.setPriority(9);

        System.out.println("AFter set Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("AFter set Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("After set Priority of the thread th3 is : " + th3.getPriority());

        //display the name of current executed thread
        System.out.println("Currently executed thread : "+Thread.currentThread().getName());
        System.out.println("Priority of main thread : "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(7);
        System.out.println("AFter set the priority of main thread :"+Thread.currentThread().getPriority());

        //if i Set the priority more than 10
        //so it will return Illegal Argumenet Exception.
        Thread.currentThread().setPriority(29);
        System.out.println("SET PRIORITY 17 " +Thread.currentThread().getPriority());
    }
}

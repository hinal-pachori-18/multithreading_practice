package ThreadGroup;

public class ThreadGroupExample1 {
    public static void main(String[] args) {
        //MAIN THREAD BELONGS TO MAIN THREAD GROUP AND NAME IS MAIN
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        //WHAT IS PARENT GROUP OF child MAIN THREAD GROUP
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        //Constructor parent group  of group1 is main
        ThreadGroup g1 = new ThreadGroup("Group1");
        System.out.println("Parent of group1 is :"+g1.getParent().getName());
          g1.setMaxPriority(10);
//        System.out.println(g1.getMaxPriority());
        ThreadGroup g2 = new ThreadGroup(g1,"Group2");
        //  //Constructor parent group  of group2 is group1.
        System.out.println("Parent of group2 is  :" +g2.getParent().getName());

        //Thread Priority
        ThreadGroup g3 = new ThreadGroup("Group3");

        Thread t1 = new Thread(g3,"Thread1");
        Thread t2 = new Thread(g3,"Thread2");
        g3.setMaxPriority(3);
        Thread t3 = new Thread(g3,"Thread3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }

}

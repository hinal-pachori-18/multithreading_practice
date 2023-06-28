
//Write program to display active thread name belong to system group and child group that is main
package ThreadGroup;

public class Enumerate extends Thread{
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

        System.out.println(system.activeCount());
        System.out.println(system);
        Thread[] t = new Thread[system.activeCount()];
        system.enumerate(t);
        for (Thread t1 :t){
            System.out.println(t1.getName() + "....." +t1.isDaemon());
        }
    }
}

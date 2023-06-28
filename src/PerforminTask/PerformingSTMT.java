package PerforminTask;

//public class PerformingSTMT extends Thread{
//    public void run()
//    {
//        System.out.println("Task one ");
//    }
//
//    public static void main(String[] args) {
//        PerformingSTMT t1 = new PerformingSTMT();
//        PerformingSTMT t2 = new PerformingSTMT();
//        t1.start();
//        t2.start();
//    }

//

import javax.swing.plaf.PanelUI;

//BY Annomous class by using extends Thread class
class TestMultitasking extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Thread1 task");
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("THread2 task");

            }
        };
        t1.start();
        t2.start();
    }
}

//By annomous class BY implement Runnable Interface
class myRunnable
{
    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("RUnnable task 1");
            }
        };
        Runnable r2 = new Runnable(){
            public void run(){
                System.out.println("Runnable task 2");
            }
        };

        Thread t1 = new Thread((Runnable) r1);
        Thread t2 = new Thread((Runnable) r2);
        t1.start();
        t2.start();
    }



}


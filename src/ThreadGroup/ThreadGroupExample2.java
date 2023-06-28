package ThreadGroup;

class myThread extends Thread {
    myThread(ThreadGroup g ,String name){
        super(g,name);
    }
    public void run()
    {

        System.out.println("Name of thread : "+Thread.currentThread().getName() +" ,Name of Group: "+Thread.currentThread().getThreadGroup().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pg= new ThreadGroup("Parent Group");
        ThreadGroup cg= new ThreadGroup(pg,"Child Group");
        ThreadGroup scg= new ThreadGroup(pg,"sub Child Group");
        myThread t1 = new myThread(pg,"Child Thread 1");
        myThread t2 =  new myThread(pg,"Child Thread 2");
        myThread t3 =  new myThread(pg,"Child Thread 2");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Active thread "+pg.activeCount()); //it return the active threads
        System.out.println("Active group count "+pg.activeGroupCount()); //it show the active sub group
        pg.list();
        Thread.sleep(10000);
        System.out.println("Active thread "+pg.activeCount()); //it return the active threads
        System.out.println("Active group count "+pg.activeGroupCount()); //it show the active sub group
        pg.list();




    }
}



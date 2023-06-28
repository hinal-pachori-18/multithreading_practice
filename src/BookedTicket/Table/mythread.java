package BookedTicket.Table;

public class mythread extends Thread{
    int n;
    String name;
    mythread(String name){
        this.name = name;
    }
    static printTable pt;
    public void run(){
        pt.printtable(n);

    }

    public static void main(String[] args) {
        pt = new printTable();
        mythread t1 = new mythread("Deepak");
        t1.n = 3;
        t1.start();

        mythread t2 = new mythread("HInal");
        t2.n = 4;
        t2.start();

        mythread t3 = new mythread("minal");
        t3.n = 2;
        t3.start();

        mythread t4 = new mythread("jInal");
        t4.n = 6;
        t4.start();
    }

}


package NamingThread;

public class NameExample2 extends Thread {
NameExample2(String t_name){
    super(t_name);
}
public void run(){
    System.out.println("RUnning Thread");
}

    public static void main(String[] args) {
        NameExample2 nt1 = new NameExample2("JAVA1.2");
        NameExample2 nt2 = new NameExample2("JAVA1.3");
        nt1.start();
        nt2.start();
        System.out.println(nt1.getName());
        System.out.println(nt2.getName());
    }
}

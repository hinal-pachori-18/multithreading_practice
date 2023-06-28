package ThreadExample;
class Mythread extends Thread
{

}
public class getSetNameofThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Mythread m1 = new Mythread();
        System.out.println(m1.getName());
        Thread.currentThread().setName("Hinal Jain");
        System.out.println(Thread.currentThread().getName());
    }
}

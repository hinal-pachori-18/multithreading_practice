package ThreadExample;

import java.lang.Thread;
class StartMethod extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("Start method ");
    }
    public void run()
    {
        System.out.println("RUn method");
    }
}
public class StartMethodOverride {
    public static void main(String[] args) {
        StartMethod sobj =  new StartMethod();
        sobj.start();
        System.out.println("Main method");
    }
}

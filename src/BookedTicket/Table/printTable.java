package BookedTicket.Table;

public class printTable {
   synchronized void printtable(int n)
    {

        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
                try {
                            Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }
}

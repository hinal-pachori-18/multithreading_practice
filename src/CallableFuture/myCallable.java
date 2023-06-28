package CallableFuture;

import ThreadPool.ThreadPoolExample;

import java.util.concurrent.*;

public class myCallable implements Callable {
    int num;
    myCallable(int num){
        this.num  = num;
    }
    @Override

    public Object call() throws Exception {
        {
            System.out.println(Thread.currentThread().getName() + "is responsible to find the sum of first num"+num);
            int sum = 0;
            for (int i=0;i<=num;i++){
                sum = sum+i;
            }
            return sum;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myCallable[] jobs = {new myCallable(10),new myCallable(20),new myCallable(30),new myCallable(40),new myCallable(50),new myCallable(60)};
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (myCallable job:jobs){
            Future f = service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}

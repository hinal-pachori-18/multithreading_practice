package BookedTicket;

public class BookTheaterSeat {

        int totalSeat = 10;
        //        //this is automatically acquire the lock for thread1 and thread 2 and release it when the thread complete task
        synchronized void bookedSeat(int seat){
            if(totalSeat >= seat)
            {
                System.out.println(seat +" : Seat booked Succesfully");
                totalSeat = totalSeat - seat;
                System.out.println("Remaining seats : "+totalSeat);
            }
            else
            {
                System.out.println("Sorry Seat cannot be booked");
                System.out.println("Remaining seats  : "+totalSeat);
            }
        }
        synchronized void nameThread(){
            System.out.println(Thread.currentThread().getName());
        }
}

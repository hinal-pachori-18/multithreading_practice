package BookedTicket;

public class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seat;
    public void run()
    {
        b.bookedSeat(seat);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        //it acquire the lock for that bee
        MovieBookApp deepak = new MovieBookApp();
        deepak.seat=7;
        deepak.start();

        MovieBookApp hinal = new MovieBookApp();
        hinal.seat=5;
        hinal.start();

        MovieBookApp meena = new MovieBookApp();
        meena.seat=5;
        meena.start();
    }
}

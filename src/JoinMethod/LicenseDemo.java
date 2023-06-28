package JoinMethod;

class Medical extends Thread
{
    public void run(){
        try {
            System.out.println("Medical started....");
            Thread.sleep(1000);
            System.out.println("Medical Completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class TestDrive extends Thread
{
    public void run(){
        try {
            System.out.println("Driving Test started....");
            Thread.sleep(5000);
            System.out.println("Driving Test Completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class OfficerSign extends Thread
{
    public void run(){
        try {
            System.out.println("Officer takes file....");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class LicenseDemo{
    public static void main(String[] args) throws InterruptedException {

        Medical m = new Medical();
        m.start();
        m.join(2000);//Testdrive and Officersign have to wait until the execution of Medical have to completed
        TestDrive td = new TestDrive();
        td.start();
        td.join();//Officersign have to wait untill the execution of Testdrive have to complete.
        OfficerSign os = new OfficerSign();
        os.start();
    }
}

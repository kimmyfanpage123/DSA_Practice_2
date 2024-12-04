package multithreading;

public class ConcurrencyTester {


    public static void main(String[] args){

        Runnable dbThreadJob = new DBJob();
        Thread dBThread = new Thread(dbThreadJob);

        Runnable calculationThreadJob = new CalculationJob();
        Thread calculationThread = new Thread(calculationThreadJob);

        dBThread.start();
        calculationThread.start();

        for(int i=0;i<500;i++) {
            System.out.println("this is main thread.");
        }
    }
}
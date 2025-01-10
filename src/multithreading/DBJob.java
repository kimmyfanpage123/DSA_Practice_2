package multithreading;

public class DBJob implements Runnable{

    @Override
    public void run() {
        //The code below will be executed by the new thread
        for(int i=0;i<500;i++) {
            System.out.println("Reading database.");
        }
    }

}
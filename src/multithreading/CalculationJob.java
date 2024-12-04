package multithreading;

public class CalculationJob implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<500;i++) {
            System.out.println("Doing calculation.");
        }
    }

}
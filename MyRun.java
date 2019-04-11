package session78_assignment;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=50; i++){
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

package session78_assignment;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for (int i=1; i<=50;i++){
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}

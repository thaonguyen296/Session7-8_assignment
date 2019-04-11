package session78_assignment;

import java.util.logging.Logger;

public class MyThread extends Thread{
    public void run() {
        for (int i=1; i<=50; i++){
            try {
                System.out.println(i);
                Thread.sleep(500);
            }catch (Exception e){
            }
        }
    }
}

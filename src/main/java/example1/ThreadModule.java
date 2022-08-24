package main.java.example1;

import java.sql.Timestamp;
import java.util.Date;

public class ThreadModule implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; ; i++) {
            if (i >= 5 && i % 5 == 0) {
                extraThread();
            }
            System.out.println(new Timestamp(new Date().getTime()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void extraThread() {
        System.out.println("Минуло 5 секунд");

    }


}

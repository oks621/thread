package main.java.example1;

import java.sql.Timestamp;
import java.util.Date;

public class Timer implements Runnable {

    private final int period;


    Timer(int period) {
        this.period = period;

    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(period * 1000);
                synchronized (GeneralClass.class) {
                    System.out.println(new Timestamp(new Date().getTime()));
                    ++GeneralClass.count;
                    GeneralClass.class.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

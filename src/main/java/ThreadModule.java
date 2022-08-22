package main.java;

import java.sql.Timestamp;
import java.util.Date;

public class ThreadModule implements Runnable {
    public static void main(String[] args) {
        synchronized (ThreadModule.class) {
            Thread threadModule1 = new Thread(() -> {
                for (int i = 0; ; i++) {


                    System.out.println(new Timestamp(new Date().getTime()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread threadModule2 = new Thread(() -> {
                for (int i = 0; ; i += 5) {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Минуло 5 секунд");
                }

            });
            threadModule1.start();
            threadModule2.start();
        }
    }

    @Override
    public void run() {

    }
}


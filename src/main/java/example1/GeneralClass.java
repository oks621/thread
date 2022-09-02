package main.java.example1;

import java.sql.Timestamp;
import java.util.Date;

public class GeneralClass {
    static int count = 0;

    {
        Thread thread1 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                    synchronized (GeneralClass.class) {
                        System.out.println(new Timestamp(new Date().getTime()));
                        System.out.println(Thread.currentThread().getName());
                        ++count;
                        GeneralClass.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        );
        thread1.start();
    }

    {
        Thread thread2 = new Thread(() -> {

            while (true)
                synchronized (GeneralClass.class) {
                    try {
                        GeneralClass.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (count % 5 == 0) {
                        System.out.println("Минуло 5 секунд");
                        System.out.println(Thread.currentThread().getName());
                    }
                }
        });
        thread2.start();
    }

}



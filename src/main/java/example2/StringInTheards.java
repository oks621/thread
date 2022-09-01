package main.java.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringInTheards {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(() -> new MetodsForTheards().number());
        service.execute(() -> {
            try {
                new MetodsForTheards().buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.execute(() -> {
            try {
                new MetodsForTheards().fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.execute(() -> {
            try {
                new MetodsForTheards().fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
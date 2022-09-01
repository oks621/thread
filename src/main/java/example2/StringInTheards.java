package main.java.example2;

public class StringInTheards {
    public static void main(String[] args) {
        new Thread(() -> {
            new MetodsForTheards().number();
        }).start();
        new Thread(() -> {
            try {
                new MetodsForTheards().buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                new MetodsForTheards().fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                new MetodsForTheards().fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
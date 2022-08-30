package main.java.example1;

public class GeneralClasss {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Timer(1));
        Thread thread2 = new Thread(new Waiter(5));
        thread1.start();
        thread2.start();
    }
}

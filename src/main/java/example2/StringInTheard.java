package main.java.example2;

public class StringInTheard implements Runnable {
    private int n;

    @Override
    public void run() {
        num();
    }

    private void num() {
        for (n = 1; n <= 15; n++) {
            if (n % 5 != 0 && n % 3 != 0) {
                System.out.print(n + " ");
            }
            fizz();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buzz();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fizzbuzz();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void fizz() {
        if (n % 3 == 0 && n % 5 != 0)
            System.out.print("fizz ");
    }

    private void buzz() {
        if (n % 5 == 0 && n % 3 != 0)
            System.out.print("buzz ");
    }

    private void fizzbuzz() {
        if (n % 5 == 0 && n % 3 == 0)
            System.out.print("fizzbuzz ");
    }


}

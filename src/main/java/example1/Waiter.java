package main.java.example1;

public class Waiter implements Runnable {
    private final int period;

    Waiter(int period) {
        this.period = period;
    }

    @Override
    public void run() {
        try {
            while (true)
                synchronized (GeneralClass.class) {
                    GeneralClass.class.wait();
                    if (GeneralClass.count % period == 0)
                        System.out.println("Минуло 5 секунд");
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


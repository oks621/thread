package main.java.example2;

public class MetodsForTheards {

    public void number() {
        while (StringInTheard.j < 15) {
            synchronized (StringInTheard.class) {

                if (StringInTheard.j % 5 != 0 && StringInTheard.j % 3 != 0) {
                    System.out.print(" " + StringInTheard.j);
                    ++StringInTheard.j;
                }

                StringInTheard.class.notifyAll();
            }
        }

    }


    public void fizz() throws InterruptedException {
        while (StringInTheard.j < 15) {
            synchronized (StringInTheard.class) {
                StringInTheard.class.wait();

                if (StringInTheard.j % 3 == 0 && StringInTheard.j % 5 != 0) {
                    System.out.print(" fizz");
                    ++StringInTheard.j;
                }
            }
        }
    }

    public void buzz() throws InterruptedException {
        while (StringInTheard.j < 15) {
            synchronized (StringInTheard.class) {
                StringInTheard.class.wait();
                if (StringInTheard.j % 3 != 0 && StringInTheard.j % 5 == 0) {
                    System.out.print(" buzz");
                    ++StringInTheard.j;
                }
            }
        }
    }

    public void fizzbuzz() throws InterruptedException {
        while (StringInTheard.j < 15) {
            synchronized (StringInTheard.class) {
                StringInTheard.class.wait();
                if (StringInTheard.j % 5 == 0 && StringInTheard.j % 3 == 0) {
                    System.out.print(" fizzbuzz");
                    ++StringInTheard.j;
                }
            }
        }
    }
}

package main.java.example2;



public class StringInTheard {
 static int counter = 1;

    {
         Thread thread1 = new Thread(() -> {

             while (counter < 15) {
                 synchronized (StringInTheard.class) {

                     if (counter % 5 != 0 && counter % 3 != 0) {
                         System.out.print(" " + counter);
                         ++counter;
                     }
                     StringInTheard.class.notifyAll();
                 }
             }
         });
thread1.start();
     }

  {
        Thread thread2 = new Thread(() -> {
            while (counter < 15) {
                synchronized (StringInTheard.class) {
                    try {
                        StringInTheard.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (counter % 3 == 0 && counter % 5 != 0) {
                        System.out.print(" fizz");
                        ++counter;
                    }
                }
            }
        });
        thread2.start();
    }

    {
            Thread thread3 = new Thread(() -> {
                while (counter < 15) {
                    synchronized (StringInTheard.class) {
                        try {
                            StringInTheard.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (counter % 3 != 0 && counter % 5 == 0) {
                            System.out.print(" buzz");
                            ++counter;
                        }
                    }
                }
            });
thread3.start();
        }


     {
        Thread thread4 = new Thread(() -> {
            while (counter < 15) {
                synchronized (StringInTheard.class) {
                    try {
                        StringInTheard.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (counter % 5 == 0 && counter % 3 == 0) {
                        System.out.print(" fizzbuzz ");
                        ++counter;
                    }
                }
            }
        });
        thread4.start();
    }


}
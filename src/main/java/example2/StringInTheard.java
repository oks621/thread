package main.java.example2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringInTheard {
 static int counter = 1;
 private Lock lock=new ReentrantLock();

    {
         Thread thread1 = new Thread(() -> {

             while (counter < 15) {
                 lock.lock();

                     if (counter % 5 != 0 && counter % 3 != 0) {
                         System.out.print(" " + counter);
                         ++counter;
                         System.out.println(Thread.currentThread().getName());
                     }
                 lock.unlock();
             }
         });
thread1.start();
     }

  {
        Thread thread2 = new Thread(() -> {
            while (counter < 15) {
             lock.lock();
             if (counter % 3 == 0 && counter % 5 != 0) {
                        System.out.print(" fizz");
                        ++counter;
                 System.out.println(Thread.currentThread().getName());
                    }
                lock.unlock();
            }
        });
        thread2.start();
    }

    {
            Thread thread3 = new Thread(() -> {
                while (counter < 15) {
                   lock.lock();
                        if (counter % 3 != 0 && counter % 5 == 0) {
                            System.out.print(" buzz");
                            ++counter;
                            System.out.println(Thread.currentThread().getName());
                        }
                    lock.unlock();
                }
            });
thread3.start();
        }


     {
        Thread thread4 = new Thread(() -> {
            while (counter < 15) {
              lock.lock();
                    if (counter % 5 == 0 && counter % 3 == 0) {
                        System.out.print(" fizzbuzz ");
                        ++counter;
                        System.out.println(Thread.currentThread().getName());
                    }
                lock.unlock();
            }
        });
        thread4.start();
    }


}
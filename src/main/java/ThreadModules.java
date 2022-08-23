package main.java;

public class ThreadModules {
    public static void main(String[] args) {
        ThreadModule threadModule = new ThreadModule();
        Thread thread1 = new Thread(threadModule);
        Thread thread2 = new Thread(threadModule);
        thread1.start();
        thread2.start();
    }

}

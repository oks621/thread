package main.java.example2;

public class StringInTheards {
    public static void main(String[] args) {
        StringInTheard stringInTheard = new StringInTheard();
        Thread thread1 = new Thread(stringInTheard);
        thread1.start();

    }
}
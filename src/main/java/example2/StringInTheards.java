package main.java.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringInTheards {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
      service.execute(StringInTheard::new);
      service.shutdown();
    }
}
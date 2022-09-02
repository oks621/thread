package main.java.example1;

import main.java.example2.StringInTheard;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GeneralClasss {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(GeneralClass::new);
        service.shutdown();
    }
}

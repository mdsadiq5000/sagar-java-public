package com.mycompany.app;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Hello world!
 */
public class App {

    public App() {}

    public static void main(String[] args) {
        System.out.println("Test");
    }

    public String getMessage(String message) {
        Random random = new Random();
        int rValue = random.nextInt();
        System.out.println(rValue);
        
        SecureRandom sr = new SecureRandom();
        sr.setSeed(123456L);
        int v = sr.nextInt(32);
        System.out.println(v);
  System.out.println(v);

        return message;
    }
}

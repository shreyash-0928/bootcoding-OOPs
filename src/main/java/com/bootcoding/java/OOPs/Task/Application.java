package com.bootcoding.java.OOPs.Task;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);

        System.out.println("Genarated Number: " + number);
        System.out.println(Service.isPrime(number));
        System.out.println(Service.Even(number));
        System.out.println(Service.Odd(number));
        System.out.println(Service.Armstrong(number));
    }

}

package com.bootcoding.java.OOPs.Task;

public class Service {

    Number num = new Number();

    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        if(num % 2 == 0){
            return false;
        }
        return true;
    }

    static boolean Even(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    static boolean Odd(int num){
        if(num % 2 != 0){
            return true;
        }

        return false;
    }


    static boolean Armstrong(int num){
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;

        }

        return false;
    }

}

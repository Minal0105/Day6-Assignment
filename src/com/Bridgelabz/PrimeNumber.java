package com.Bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. you want to check prime or not ");
        int n = scanner.nextInt();
        if(n==0||n==1){
            System.out.println(n+ "is not a prime number");
        }else{
            for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println(n+ " is not prime Number ");
                break;

            } else
                System.out.println(n+ " is prime Number ");
            break;

        }
    }
}}
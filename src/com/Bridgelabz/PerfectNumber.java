package com.Bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. you want to check perfect number or not ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
                a = a + i;
            }
        }
        System.out.println(a);
        if (a == n) {
            System.out.println(n + " is Perfect Number ");
        } else {
            System.out.println(n + " is Not Perfect Number ");
        }

    }
}

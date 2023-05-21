package com.Bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,temp;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. you want to count = ");
        int n = scanner.nextInt();
        System.out.print(a+ "" +b);
        for (int i = 2; i < n; ++i){
            temp=a+b;
            System.out.print(""+temp);
            a=b;
            b=temp;
        }
    }
}

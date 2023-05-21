package com.Bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reminder,Reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. you want to reverse ");
        int n = scanner.nextInt();
        while(n!=0){
            reminder=n%10;
            Reverse    =(Reverse*10)+reminder;
              n      =n/10;
        }
        System.out.println("Reverse number is" +Reverse);
     }

}


package com.Bridgelabz;
import java.util.Scanner;
public class Stopwatch {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Stopwatch Program");
            System.out.println("Press Enter to start the stopwatch...");
            scanner.nextLine();
            long startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started. Press Enter to stop...");
            scanner.nextLine();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}




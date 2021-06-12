package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        double average, maxNumber, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        maxNumber = input.nextInt();

        for (int i = 0; i < maxNumber; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }

        average = sum / count;
        System.out.print("Average is " + average);
    }
}

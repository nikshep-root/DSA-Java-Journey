package ConditionalsAndLoops;

import java.util.Scanner;
public class Average {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n =1;
        double sum = 0.0;
        for(int i = 0 ; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            double num = sc.nextDouble();
            sum += num;
        }
        double avg = sum / n;
        System.out.println("The average is: " + avg);
      }    
} 
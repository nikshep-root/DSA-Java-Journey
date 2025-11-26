package ConditionalsAndLoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int negCount = 0;
        int posEvenCount = 0;
        int posOddCount = 0;
        List<Integer> arr = new ArrayList<>();
        while (num != 0) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            if (num ==0) {
                System.out.println("You entered 0, exiting the loop.");
            }
            arr.add(num);
            if (num < 0) {
                negCount += num;
            }
            else if (num > 0 && num % 2 == 0) {
                posEvenCount += num;
            } else if (num > 0 && num % 2 != 0) {
                posOddCount += num;
            }
        }
        System.out.println("You entered the following numbers: " + arr);
        System.out.println("Sum of negative numbers: " + negCount);
        System.out.println("Sum of positive even numbers: " + posEvenCount);
        System.out.println("Sum of positive odd numbers: " + posOddCount);
    }
}

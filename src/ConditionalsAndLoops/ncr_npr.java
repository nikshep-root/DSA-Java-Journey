package ConditionalsAndLoops;

import java.util.Scanner;
public class ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);

        System.out.println("nCr: " + ncr);
        System.out.println("nPr: " + npr);
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

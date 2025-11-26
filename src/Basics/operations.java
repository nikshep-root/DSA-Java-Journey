package Basics;

import java.util.Scanner;
public class operations {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter secont number: ");
        float b = sc.nextFloat();
        System.out.println("Addition: " + (int)(a +b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

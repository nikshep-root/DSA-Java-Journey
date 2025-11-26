package Functions;

import java.util.Scanner;

public class Vote {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        String a = vo(age);
        System.out.println(a);
   }
   static String vo(int age) {
       if (age >= 18) {
           return "You are eligible to vote.";
       } else {
           return "You are not eligible to vote.";
       }
   }
}

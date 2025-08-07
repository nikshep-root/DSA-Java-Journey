import java.util.Scanner;
public class Grade {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of the subject (out of 100): ");
        int marks = sc.nextInt();
        System.out.println("The grade is: " + NumericGrade(marks));
     }
     static String NumericGrade(int marks) {
        if (marks > 90) {
            return "AA";
        } else if (marks > 80) {
            return "AB";
        } else if (marks > 70) {
            return "BB";
        } else if (marks > 60) {
            return "BC";
        } else if (marks > 50) {
            return "CD";
        } else if (marks > 40) {
            return "DD";
        } else {
            return "Fail";
        }
     }
    }
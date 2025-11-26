package ConditionalsAndLoops;

import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I assume the total credits is 20 (2 four credit subjects and 3 three credit subjects and 3 one credit subjects)");
        System.out.println ("Enter the internal marks of 4 credit subject 1(out of 50): ");
        int sub4_1 = sc.nextInt();
        System.out.println ("Enter the internal marks of 4 credit subject 2(out of 50): ");
        int sub4_2 = sc.nextInt();
        System.out.println ("Enter the internal marks of 3 credit subject 1(out of 50): ");
        int sub3_1 = sc.nextInt();
        System.out.println ("Enter the internal marks of 3 credit subject 2(out of 50): ");
        int sub3_2 = sc.nextInt();
        System.out.println ("Enter the internal marks of 3 credit subject 3(out of 50): ");
        int sub3_3 = sc.nextInt();
        System.out.println ("Enter the marks of 1 credit subject 1(out of 50): ");
        int sub1_1 = sc.nextInt();
        System.out.println ("Enter the marks of 1 credit subject 2(out of 50): ");
        int sub1_2 = sc.nextInt();
        System.out.println ("Enter the marks of 1 credit subject 3(out of 50): ");
        int sub1_3 = sc.nextInt();

        System.out.println("Enter the External marks of 4 credit subject 1(out of 100): ");
        int ext4_1 = sc.nextInt();
        System.out.println("Enter the External marks of 4 credit subject 2(out of 100): ");
        int ext4_2 = sc.nextInt();
        System.out.println("Enter the External marks of 3 credit subject 1(out of 100): ");
        int ext3_1 = sc.nextInt();
        System.out.println("Enter the External marks of 3 credit subject 2(out of 100): ");
        int ext3_2 = sc.nextInt();
        System.out.println("Enter the External marks of 3 credit subject 3(out of 100): ");
        int ext3_3 = sc.nextInt();

        int total_4cre_1 = sub4_1 + (ext4_1 / 2);
        int total_4cre_2 = sub4_2 + (ext4_2 / 2);
        int total_3cre_1 = sub3_1 + (ext3_1 / 2);
        int total_3cre_2 = sub3_2 + (ext3_2 / 2);
        int total_3cre_3 = sub3_3 + (ext3_3 / 2);
        int total_1cre_1 = sub1_1 * 2;
        int total_1cre_2 = sub1_2 * 2;
        int total_1cre_3 = sub1_3 * 2;

        System.out.println("Calculating CGPA...");
        double cgpa = (NumericGrade(total_4cre_1) * (4.0/20.0)) + (
                      NumericGrade(total_4cre_2) * (4.0/20.0)) +
                      (NumericGrade(total_3cre_1) * (3.0/20.0)) +
                      (NumericGrade(total_3cre_2) * (3.0/20.0)) +
                      (NumericGrade(total_3cre_3) * (3.0/20.0)) +
                      (NumericGrade(total_1cre_1) * (1.0/20.0)) +
                      (NumericGrade(total_1cre_2) * (1.0/20.0)) +
                      (NumericGrade(total_1cre_3) * (1.0/20.0));
        System.out.printf("CGPA: %.2f ", cgpa);

        System.out.println("Detailed Grades:");
        System.out.println("4 credit subject 1: " + round(total_4cre_1) + " with GPA : " + NumericGrade(total_4cre_1));
        System.out.println("4 credit subject 2: " + round(total_4cre_2) + " with GPA : " + NumericGrade(total_4cre_2)); 
        System.out.println("3 credit subject 1: " + round(total_3cre_1) + " with GPA : " + NumericGrade(total_3cre_1));
        System.out.println("3 credit subject 2: " + round(total_3cre_2) + " with GPA : " + NumericGrade(total_3cre_2));
        System.out.println("3 credit subject 3: " + round(total_3cre_3) + " with GPA : " + NumericGrade(total_3cre_3));
        System.out.println("1 credit subject 1: " + round(total_1cre_1) + " with GPA : " + NumericGrade(total_1cre_1));
        System.out.println("1 credit subject 2: " + round(total_1cre_2) + " with GPA : " + NumericGrade(total_1cre_2));
        System.out.println("1 credit subject 3: " + round(total_1cre_3) + " with GPA : " + NumericGrade(total_1cre_3));

        
    }

    static String round(int marks) {
        String grade;
        if (marks >= 90) {
            grade = "O";
        }
        else if (marks >= 80) {
            grade = "A+";
        }
        else if (marks >= 70) {
            grade = "A";
        }
        else if (marks >= 60) {
            grade = "B+";
        }
        else if (marks >= 55 && marks < 60) {
            grade = "B";
        }
        else if (marks >= 50 && marks < 55) {
            grade = "C";
        }
        else if (marks >= 40 && marks < 50) {
            grade = "P";
        }
        else {
            grade = "F";
        }
        return grade;
    }

    static int NumericGrade(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 55) return 6;
        else if (marks >= 50) return 5;
        else if (marks >= 40) return 4;
        else return 0;
    }
}
    

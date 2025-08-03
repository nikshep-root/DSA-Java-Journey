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
         
        System.out.println("Grades:");
        System.out.println("4 credit subject 1: " + round(total_4cre_1));
        System.out.println("4 credit subject 2: " + round(total_4cre_2));
        System.out.println("3 credit subject 1: " + round(total_3cre_1));
        System.out.println("3 credit subject 2: " + round(total_3cre_2));
        System.out.println("3 credit subject 3: " + round(total_3cre_3));
        System.out.println("1 credit subject 1: " + round(total_1cre_1));
        System.out.println("1 credit subject 2: " + round(total_1cre_2));
        System.out.println("1 credit subject 3: " + round(total_1cre_3));

        
    }

    static String round(int marks) {
        String grade;
        if (marks >= 90) {
            marks = 10;
            grade = "O";
        }
        else if (marks >= 80) {
            marks = 9;
            grade = "A+";
        }
        else if (marks >= 70) {
            marks = 8;
            grade = "A";
        }
        else if (marks >= 60) {
            marks = 7;
            grade = "B+";
        }
        else if (marks >= 55 && marks < 60) {
            marks = 6;
            grade = "B";
        }
        else if (marks >= 50 && marks < 55) {
            marks = 5;
            grade = "C";
        }
        else if (marks >= 40 && marks < 50) {
            marks = 4;
            grade = "P";
        }
        else {
            marks = 0;
            grade = "F";
        }
        return grade;
    }
}
    

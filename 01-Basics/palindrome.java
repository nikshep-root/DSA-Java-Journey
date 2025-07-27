import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String revString = "";
        for (int i= str.length() - 1; i >=0; i--) {
            revString += str.charAt(i);
        }
        if (str.equals(revString)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("the string is not a palindrome");
        }
        }
}

package Arrays.Linear_search;

import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter a character to be searched in a String : ");
        char target = sc.next().charAt(0);
        boolean ans = check(str , target);
        System.out.println(ans);
    }
    static boolean check(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        /* we can also write
        for (char ch : str.toCharArray()) {
           if (target == ch) {
              return true
           }
        }
         */
        for (int i=0 ; i<str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    } 
}

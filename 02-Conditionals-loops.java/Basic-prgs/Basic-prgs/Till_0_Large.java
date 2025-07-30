import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Till_0_Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 5; 
        int n = 1;
        List<Integer> arr = new ArrayList<>();
        int large = 0;
        while (count > 0) {
            System.out.println("Enter an integer: ");
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("You entered 0, loop will end.");
                break;
            }
            arr.add(n);
            if (n>large) {
                large = n;
            } 
        }
        System.out.println("You entered the following integers: " + arr);
        System.out.println("The largest integer is: " + large);
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Till_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        List<Integer> arr = new ArrayList<>();
        while (n != 0) {
            System.out.println("Enter an integer : ");
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("You entered 0, loop will end. ");
                break;
            }
            arr.add(n);
        }
        int sum = 0;
        System.out.println("You entered the folliing integers: " + arr);
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println("Sum of the integers is: " + sum);
    }
}

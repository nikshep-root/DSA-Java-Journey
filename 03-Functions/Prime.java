import java.util.Scanner;
public class Prime {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        Boolean isPrime = check(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    static Boolean check(int num) {
        if (num <= 1) {
            return false;   
        }
        else if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

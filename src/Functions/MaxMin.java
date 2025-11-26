package Functions;

import java.util.Scanner;
import java.util.ArrayList;
public class MaxMin {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of numbers you want to enter: ");
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i =0 ; i<n;i++) {
            System.out.println("Enter the " + (i+1) + " number: ");
            int num = sc.nextInt();
            numbers.add(num);
        }
        int a = maxi(numbers);
        int b = mini(numbers);
        System.out.println("You entered: " + numbers);
        System.out.println("The maximum number is: " + a);
        System.out.println("The minimum number is: " + b);
    }
    static int maxi(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i <numbers.size(); i++) {
            if (numbers.get(i) >max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    static int mini(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }
}

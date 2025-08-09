public class SumOfNaturalNums {
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate the sum of natural numbers up to a different number
        int sum = calculateSum(n);
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateSum(n - 1);
    }
}

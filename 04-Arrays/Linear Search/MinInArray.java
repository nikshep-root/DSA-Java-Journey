import java.util.Scanner;
import java.util.Arrays;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0 ; i< n ; i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(arr));
        int ans = minimum(arr);
        System.out.println("Minimum number in an array is : " + ans);
    }
    static int minimum(int[] arr) {
        int min = arr[0];
        for(int i=0 ; i < arr.length; i++ ) {
            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        return min;
    }
}

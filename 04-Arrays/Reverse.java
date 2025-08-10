import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++ ) {
             arr[i] =  sc.nextInt();
        } 
        System.out.println("Entered array : " + Arrays.toString(arr));
        int index1 = 0;
        int index2 = n - 1;
        while (index1 < index2) {
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
        System.out.println("Elements after reversing : " + Arrays.toString(arr));
        
    }
    static void swap(int arr[], int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

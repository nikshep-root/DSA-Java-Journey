package Arrays;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 4,73,25,6,8};
        System.out.println("Before swapping: ");
        for( int n : num) {
            System.out.print(n + " ");
        }
        /* we can use Arrays.toString() to print the array */
        /* Output: [4, 73, 25, 6, 8] */
        System.out.println("Enter the indices to swap:");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        swap(num,index1,index2);
        System.out.println("Array after swapping: ");
        for( int n : num) {
            System.out.print(n + " ");
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) {
            System.out.println("Invalid indices. Please enter valid indices.");
            return;
        }
        else if (index1 == index2) {
            System.out.println("Indices are the same, no swap needed.");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

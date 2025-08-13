import java.util.Scanner;
public class Order_Agnostic_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {746,353,322,67,45,31,9,4,1};
        int target = 322;
        String ans ="";
        if(arr[0] < arr[arr.length-1]) {
            ans = ascending(arr, target);
        }
        else {
            ans = descending(arr,target);
        }
        System.out.println(ans);
    }
    static String ascending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return "Element found :) at " + mid + " and the element is " + arr[mid];
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return "Element not found :( ";
    }
    static String descending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return "Eleent found :) at " + mid + " and the element is " + arr[mid];
            }
            if (arr[mid] < target ) {
                 end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return "Element not found :( ";
    }
}

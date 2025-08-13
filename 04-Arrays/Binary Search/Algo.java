import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {4,6,20,34,78,89,542};
        int target = 785;
        String ans = Search(arr, target);
        System.out.println(ans);
    }
    static String Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return "element found :)";
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return "element not found :(";
    }
}

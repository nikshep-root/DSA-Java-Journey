package Arrays.Binary_Search;/*finding the number which is smallest number greater than the target element */

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,14,17,19,24,29};
        int target = 20;
        int ans = result(arr, target);
        System.out.println(ans);
    }
    static int result(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end-start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if (start < arr.length) {
            return arr[start];
        }
        return -1;
    }
}

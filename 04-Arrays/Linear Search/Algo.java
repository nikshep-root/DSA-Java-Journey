import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,7,2,64,85,27,543};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int arr[], int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}

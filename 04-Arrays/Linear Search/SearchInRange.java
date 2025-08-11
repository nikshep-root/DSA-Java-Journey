import java.util.Scanner;
import java.util.ArrayList;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (type 0 to stop)");
        while (true) {
           int num = sc.nextInt();
           if (num == 0) break;
           arr.add(num);
        }
        System.out.println("Entered array is " + arr);
        System.out.println("Enter the index number in which you want to search in that specific range :");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println("Elements in range contains: ");
        for(int i = index1; i<=index2; i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("Enter a number you want to search : ");
        int target = sc.nextInt();
        if (index1 < 0 || index2 < 0 || index2 >arr.size()) {
            System.out.println("Enter a vaild index number!");
        }
        if (index1 == index2) {
            System.out.println("What do you mean! There is no specific range!!");
        }
        if (index1 > index2) {
            System.out.println("first entered index should not be larger than second entered index!");
        }
        String ans = check(arr, index1,index2, target);
        System.out.println(ans);
    }
    static String check(ArrayList<Integer> arr , int index1, int index2 , int target) {
        for(int i = index1; i <= index2 ; i++) {
            if (target == arr.get(i)) {
                return "Element found :)";
            }
        }
        return "Element not found :(" ;
    }
}

package Sorting;

import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,3,8,2,77,54};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1;j <= arr.length-i-1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }
}

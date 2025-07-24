import java.util.Scanner;

public class Fabiocci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c;

        System.out.print(a +" ");
        System.out.print(b +" ");
        for(int i=2; i<n; i++){
            c= a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
        
    }
}

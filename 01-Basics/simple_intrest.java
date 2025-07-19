//package 01-Basics;
import java.util.Scanner;
public class simple_intrest {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter principle amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate of intrest: ");
        float r = sc.nextFloat();
        System.out.println("Enter time in years:");
        float t = sc.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("Simple intrest is " + si);
        }
}

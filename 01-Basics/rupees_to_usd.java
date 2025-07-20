import java.util.Scanner;
public class rupees_to_usd {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter amount in rupees: ");
        float rupees = sc.nextFloat();
        float usd = rupees / 86.19f;
        System.out.println("Equivelent amount in USD: " + usd);
    }   
}

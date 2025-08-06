import java.util.Scanner;
public class Kunal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the month : ");
        String month = sc.nextLine();
        int days = 0;
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || 
            month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") || 
            month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") || 
            month.equalsIgnoreCase("December")) {
            days = 31;
        }
        else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || 
                 month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
            days = 30;
        }
        else if (month.equalsIgnoreCase("February")) {
            days = 28; // Assuming it's not a leap year
        }
        else {
            System.out.println("Invalid month entered.");
            return;
        }

        int evenDays = even(days);
        System.out.println("Number of days that Kunal can go out with his friends in " + month + " is " + evenDays);
    }
    static int even(int days) {
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

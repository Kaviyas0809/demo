import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        System.out.print("Enter number of units: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = 0;
        } else if (units <= 200) {
            bill = units * 0.8;
        } else if (units <= 300) {
            bill = units * 1.5;
        } else {
            bill = units * 3;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}
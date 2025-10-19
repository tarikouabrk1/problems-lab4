package problem1;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int salespeople = scan.nextInt();

        int[] sales = new int[salespeople];
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");

        int maxValue = sales[0];
        int minValue = sales[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxValue) {
                maxValue = sales[i];
                maxIndex = i;
            }
            if (sales[i] < minValue) {
                minValue = sales[i];
                minIndex = i;
            }
            System.out.println(" " + (i + 1) + "\t\t" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + (double) sum / salespeople);
        System.out.println("Salesperson " + (maxIndex + 1) + " had the highest sale with $" + maxValue);
        System.out.println("Salesperson " + (minIndex + 1) + " had the lowest sale with $" + minValue);

        System.out.print("\nEnter a value: ");
        int val = scan.nextInt();
        int count = 0;

        System.out.println("\nSalespeople who exceeded " + val + ":");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > val) {
                System.out.println(" " + (i + 1) + " " + sales[i]);
                count++;
            }
        }

        System.out.println("Number of salespeople who exceeded " + val + ": " + count);

        scan.close();
    }
}

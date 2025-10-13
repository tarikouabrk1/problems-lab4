package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        //final int SALESPEOPLE = 5;
        int salespeople;
        System.out.print("Enter the number of salespeople:");
        Scanner scan = new Scanner(System.in);
        salespeople=scan.nextInt();

        int[] sales = new int[salespeople];

        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxva=sales[0];
        int minva=sales[0];
        int maxindex=0;
        int minndex=0;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i]>maxva){
                maxva=sales[i];
                maxindex=i;
            }
            if (sales[i]<minva){
                minva=sales[i];
                minndex=i;
            }
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The avergae sale: " + sum/salespeople);
        System.out.println("Salespoerson "+ (maxindex+1)+ " had the highest Sale with "+maxva);
        System.out.println("Salespoerson "+ (minndex+1)+ " had the lowest Sale with "+minva);

        int val;
        System.out.print("Enter a value: ");
        val = scan.nextInt();
        int somme=0;
        System.out.println("people who have their sales greater than " + val + " are");
        for (int i=0; i<sales.length; i++){
            if (sales[i]>val){
                somme=somme+1;
                System.out.println(" " + (i+1) + " " + sales[i]);
            }
        }
        System.out.println("The number of people whose sales are greater than " +val+ " is " +somme);

    }
}
package problem2;

import java.util.Scanner;

public class IntegerListTest {
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    // main menu loop
    //-------------------------------------------------------
    public static void main(String[] args) {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    //--------------------------------------
    // Do what the menu item calls for
    //--------------------------------------
    public static void dispatch(int choice) {
        int val;
        switch(choice) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.print("Enter the integer to add: ");
                val = scan.nextInt();
                list.addElement(val);
                break;
            case 4:
                System.out.print("Enter the integer to remove (first occurrence): ");
                val = scan.nextInt();
                list.removeFirst(val);
                break;
            case 5:
                System.out.print("Enter the integer to remove (all occurrences): ");
                val = scan.nextInt();
                list.removeAll(val);
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    //----------------------------
    // Print the user's choices
    //----------------------------
    public static void printMenu() {
        System.out.println("\nMenu");
        System.out.println("====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first! **)");
        System.out.println("2: Print the list");
        System.out.println("3: Add an element");
        System.out.println("4: Remove first occurrence of a value");
        System.out.println("5: Remove all occurrences of a value");
        System.out.print("\nEnter your choice: ");
    }
}

/*
    @Author : Yohanze Obmerga
*/
package Week4;

import java.util.Scanner;

public class WarehouseIn {
    private static final int DAMAGED_SHELF = -1;
    private static final int CRITICALLY_LOW_LIMIT = 1;

    public static void main(String[] var0) {
        Scanner input = new Scanner(System.in);
        int[][] inventory = {
            {12, -1, 4},
            {8, 3, 0},
            {15, 6, -1}
        };
        int choice;
        /*this do while loop stores the entire menu */
        do {
            System.out.println("\nWarehouse Inventory Menu");
            System.out.println("1. Total inventory");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("0. Exit");
            choice = readInteger(input, "Choose an option: ");

            switch (choice) {
                case 1:
                    displayTotalInventory(inventory);
                    break;
                case 2:
                    findFirstCriticallyLowShelf(inventory);
                    break;
                case 3:
                    restockShelf(input, inventory);
                    break;
                case 0:
                    System.out.println("Exiting inventory scanner.");
                    break;
                default:
                    System.out.println("Invalid option. Choose 0 through 3.");
            }
        } while (choice != 0);

        input.close();
        return;
    }
    /*this function checks if user inputs an integer*/
    private static int readInteger(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }
    /*Displays the total inve */
    private static void displayTotalInventory(int[][] inventory) {
        int total = 0;
        for (int row = 0; row < inventory.length; row++) {
            for (int column = 0; column < inventory[row].length; column++) {
                if (inventory[row][column] == DAMAGED_SHELF) {
                    continue;
                }
                total += inventory[row][column];
            }
        }
        System.out.println("Total inventory (excluding damaged shelves): " + total);
    }

    private static void findFirstCriticallyLowShelf(int[][] inventory) {
        boolean found = false;
        for (int row = 0; row < inventory.length && !found; row++) {
            for (int column = 0; column < inventory[row].length; column++) {
                int itemCount = inventory[row][column];
                if (itemCount == DAMAGED_SHELF) {
                    continue;
                }
                if (itemCount <= CRITICALLY_LOW_LIMIT) {
                    System.out.println("First critically low shelf: row " + (row + 1)
                            + ", column " + (column + 1) + " (" + itemCount + " items)");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    private static void restockShelf(Scanner input, int[][] inventory) {
        while (true) {
            int row = readInteger(input, "Enter shelf row (1-" + inventory.length + "): ") - 1;
            if (row < 0 || row >= inventory.length) {
                System.out.println("Invalid row. Try again.");
                continue;
            }

            int column = readInteger(input, "Enter shelf column (1-"
                    + inventory[row].length + "): ") - 1;
            if (column < 0 || column >= inventory[row].length) {
                System.out.println("Invalid column. Try again.");
                continue;
            }
            if (inventory[row][column] == DAMAGED_SHELF) {
                System.out.println("That shelf is damaged and cannot be restocked.");
                continue;
            }

            int amount = readInteger(input, "Enter a positive restock amount: ");
            if (amount <= 0) {
                System.out.println("Restock amount must be positive. Try again.");
                continue;
            }

            inventory[row][column] += amount;
            System.out.println("Shelf restocked. New item count: " + inventory[row][column]);
            return;
        }
    }
}

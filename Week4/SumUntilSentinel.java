package Week4;
import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] var0) {
        int sum = 0;
        int num = 0;
        Scanner Numbers = new Scanner(System.in);
        /*The Scanner is for input of integers */
        System.out.println("This program sums numbers until you enter -1.");
        while (true) {
            System.out.print("Enter a number (-1 to quit): ");
            /* Since this accepts any integer then negative numbers are possible */
            num = Numbers.nextInt();
            if (num == -1) {
                break;
            }/* When -1 is inputted the system stops so -1 was never added */
            sum += num;

        }
        System.out.println("The sum total is: " + sum);
        Numbers.close();
    }
}
package Week4;

public class PatternGenerator {
    public static void main(String[] var0) {
        System.out.println("This is a right triangle");
        for (int i = 1; i <= 12; i++) {
            /* this code stops 6 * to generate and skips directly to 7 * */
            if (i == 6) {
                continue;
            }
            if (i == 9) {
                /* this code skips another line so the final product would have less than 2 lines*/
                continue;
            }

            for (int j = 1; j <= i; j++) {
                /* this loop stops the pattern to expand and stops it to generate only 9* */
                if (j == 10) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
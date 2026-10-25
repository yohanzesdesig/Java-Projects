/*
    @Author : Yohanze Obmerga
*/
package Week2;

public class PrecedencePuzzle {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        /*I expect this to be false because the expression will lead to 9 which is less 
        than 11 and x = 4 is not equal to 6*/
        boolean expression1 = (x++ + y * 2 >= 11) && (x == 6);
        System.out.println("Expression 1: (x++ + y * 2 >= 11) && (x == 6) "
                + expression1 + " (x = " + x + ", y = " + y + ")");
        /*this is automatically true because the first condition is gonna be 1 < 5 
        which is true and the condition is "or" */
        boolean expression2 = (y-- * 2 < x + 1) || (++x == 7);
        System.out.println("Expression 2: (y-- * 2 < x + 1) || (++x == 7) -> "
                + expression2 + " (x = " + x + ", y = " + y + ")");
        /*This is false because the first expression equals to 3 >= 4 which is not 
        true and the condition is "and" */
        boolean expression3 = (++x - y >= 4) && (y++ == 2);
        System.out.println("Expression 3: (++x - y >= 4) && (y++ == 2) -> "
                + expression3 + " (x = " + x + ", y = " + y + ")");
        /*I didnt remember that ++ changes the x directly so it would be 6 >= 4*/
    }
}

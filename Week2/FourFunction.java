/*
    @Author : Yohanze Obmerga
*/
package Week2;

public class FourFunction {
    public static void main(String[] var0) {
        /*Since input isnt required yet i just declared both integerss*/
        int var1 = 45;
        int var2 = 13/*-13 uncomment this to test for negative operands */;
        System.out.println("The sum of " + var1 + " and " + var2 + " is " + (var1 + var2));
        System.out.println("The difference of " + var1 + " and " + var2 + " is " + (var1 - var2));
        /*if the operand is negative addition becomes subtraction and vice versa*/
        System.out.println("The product of " + var1 + " and " + var2 + " is " + (var1 * var2));
        /*if the operand is negative multiplication outputs a negative product*/
        System.out.println("The quotient of " + var1 + " and " + var2 + " is " + (var1 / var2));
        /*if the operand is negative multiplication outputs a negative product same with division*/
    }
}

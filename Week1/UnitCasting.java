/*
    @Author : Yohanze Obmerga
*/
package Week1;

public class UnitCasting {
    public static void main(String[] var0) {

        System.out.println("====================================");
        int St2= 20;
        System.out.println("The following is a int: " + St2);
        double Ed2 = (double)St2;
        System.out.println("The following is a double: " + Ed2);
        System.out.println("====================================");
        /* The example above used inplicit widening to convert which gives a decimal number to the previous int*/
        
        System.out.println("====================================");
        double St= 10.99;
        System.out.println("The following is a double: " + St);
        int Ed = (int)St;
        System.out.println("The following is a int: " + Ed);
        System.out.println("====================================");
        /* The example above used explicit narrowing to convert which removes a decimal number from the previous double number*/
    }
}

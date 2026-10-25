/*
    @Author : Yohanze Obmerga
*/
package Week1;

public class Overflow {
    public static void main(String[] var0) {

        /*This cluster of code shows how a byte overflowing shows */
        System.out.println("====================================");
        byte sam = 127;
         System.out.println("This is a byte: " + sam);
        byte nxt = ++sam;
        System.out.println("This is the byte overflowing: " + nxt);

        /*This other cluster of code shows how == checks if they are the same variable including the name while
        .equals() checks if the variable carries the same data i.e. text, integer, or character*/
        String Name1 = "Carl";
        String Name2 = new String("Carl");
        String Name3 = new String("Carl");
        System.out.println(Name1==Name2);
        System.out.println(Name2==Name3);
        System.out.println(Name1==Name3);
        System.out.println(Name1.equals(Name2));
        System.out.println(Name1.equals(Name3));
        System.out.println(Name2.equals(Name3));

        /*This code checks for how modifying arrays affect each array if they have the same array variables*/
        int[] array = {1,2,3,4,5};
        int[] array2 = array;

        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);
        /*This changes the 2nd int to 67*/
        array[1] = 67;
        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);
        /*This changes the 5th int to 21*/
        array2[4] = 21;
        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);
    }
}

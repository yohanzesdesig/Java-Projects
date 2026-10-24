package Week1;

public class Overflow {
    public static void main(String[] var0) {

        System.out.println("====================================");
        byte sam = 127;
         System.out.println("This is a byte: " + sam);
        byte nxt = ++sam;
        System.out.println("This is something: " + nxt);

        String Name1 = "Carl";
        String Name2 = new String("Carl");
        String Name3 = new String("Carl");
        System.out.println(Name1==Name2);
        System.out.println(Name2==Name3);
        System.out.println(Name1==Name3);
        System.out.println(Name1.equals(Name2));
        System.out.println(Name1.equals(Name3));
        System.out.println(Name2.equals(Name3));

        int[] array = {1,2,3,4,5};
        int[] array2 = array;

        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);

        array[1] = 67;
        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);

        array2[4] = 21;
        System.out.println("1:" + array[0] + "-" + array[1] + "-" + array[2] + "-" + array[3] + "-" + array[4]);
        System.out.println("2:" + array2[0] + "-" + array2[1] + "-" + array2[2] + "-" + array2[3] + "-" + array2[4]);
    }
}

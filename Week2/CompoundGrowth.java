public class CompoundGrowth {
    public static void main(String[] var0) {
        double Bal = 100;
        int count = 0;
        System.out.println("The starting Balance is: "+Bal);
        Bal *= 0.25;
        Bal += 100;
         System.out.println("The new balance after adding the interest and the initial balance is: "+ Bal);
        Bal *= 0.25;
        Bal += 125.0;
        System.out.println("The new balance after adding the interest and the balance is: "+ Bal);
         Bal *= 0.25;
        Bal += 156.25;
        System.out.println("The new balance after adding the interest and the balance is: "+ Bal);
        System.out.println(count++);
        /*The system printed out count before it was incremented, so the first time it printed out 0*/
        System.out.println(count);
        /*The system printed out count after it was incremented so it printed out 1*/
    }
}

/*
    @Author : Yohanze Obmerga
*/
package Week3;

public class MultiTierDiscount {
    public static void main(String[] var0) {
        double P = 100.00;
        if (P > 1000) {
        /*This code gives a discount per tier with lowest in bronze having 5%*/
            P = P + (P * 0.20);
            System.out.println("Customer Type: PLATINUM and Discount: 20% it equals to: " + P);
        } else if (P > 500) {
            P = P + (P * 0.15);
            System.out.println("Customer Type: GOLD and Discount: 15% it equals to: " + P);
        } else if (P > 100) {
            P = P + (P * 0.10);
            System.out.println("Customer Type: SILVER and Discount: 10% it equals to: " + P);
        } else if (P > 0) {
            P = P + (P * 0.05);
            System.out.println("Customer Type: BRONZE and Discount: 5% it equals to: " + P);
        } else {
            /*if the double inputs 0 or negatives then this will be outputted*/
            System.out.println("Customer Type: INVALID");
        }
    }
}

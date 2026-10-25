/*
    @Author : Yohanze Obmerga
*/
package Week1;

public class TypeSafe {
    public static void main(String[] var0) {
        int  amount = 18;
        double price = 6.7, TC = amount*price;
        /*Since we will use an int and double we should use a double for the Total Cost because
        the product could include decimals*/
        String Name = "Walmart", Product = "Canned Goods" /*I added the name of the product for there ot be a specific thing
        the user buys*/;

        System.out.println("====================================");
        System.out.println("Store Name: " + Name);
        System.out.println("Product: " + Product);
        System.out.println("Amount: " + amount);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + Math.round(TC*100.0)/100.0);
        System.out.println("====================================");
    }
}

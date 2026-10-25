/*
    @Author : Yohanze Obmerga
*/
package Week3;

public class NestedLoginValidator {
    public static void main(String[] var0) {
       String PW = "MIKE"/*YOH uncomment to check for incorrect Username*/, CPW = "MIKE";
        int PN = 1234/*4321 uncomment to check for incorrect Password*/, CPN = 1234;

        System.out.println("Enter your Username: " + PW);
        System.out.println("Enter your PIN: " + PN);
        if (PW.equals(CPW) ) {
            if (PN == CPN){
                System.out.println("The Username and Pin are Correct! Logged In");
            }else{
                System.out.println("The Pin is incorrect");
            }
        }else {
            System.out.println("The Username is Incorrect");
        }
            
    }
}

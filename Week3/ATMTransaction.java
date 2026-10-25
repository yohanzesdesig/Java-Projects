/*
    @Author : Yohanze Obmerga
*/
package Week3;

public class ATMTransaction {
    public static void main(String[] var0) {
        String PW = "MIKE", CPW = "MIKE", AT = "GOLD", PAT = "GOLD";
        int PN = 1234, CPN = 1234;
        double AB = 1000.00, W = 1.00;

        System.out.println("Enter your Username: " + PW);
        System.out.println("Enter your PIN: " + PN);
        if (PW.equals(CPW) && PN == CPN) {
            System.out.println("Checking Account Security: Approved");
            AT = PAT;

            double Wl;
            if (AT.equals("BRONZE")) {
                System.out.println("Account Type: BRONZE");
                Wl = 250;
            } else if (AT.equals("SILVER")) {
                System.out.println("Account Type: SILVER");
                Wl = 500;
            } else if (AT.equals("GOLD")) {
                System.out.println("Account Type: GOLD");
                Wl = 1000;
            } else if (AT.equals("PLATINUM")) {
                System.out.println("Account Type: PLATINUM");
                Wl = 2000;
            } else {
                System.out.println("Account Type: INVALID");
                Wl = 0;
            }

            double feePercentage;
            switch (AT) {
                case "BRONZE":
                    feePercentage = 2.0;
                    break;
                case "SILVER":
                    feePercentage = 1.5;
                    break;
                case "GOLD":
                    feePercentage = 1.0;
                    break;
                case "PLATINUM":
                    feePercentage = 0.5;
                    break;
                default:
                    feePercentage = -1;
                    break;
            }

            if (feePercentage < 0) {
                System.out.println("Withdrawal: Denied - the account tier is invalid, so no transaction fee can be determined.");
            } else if (W <= 0) {
                System.out.println("Withdrawal: Denied - the withdrawal amount must be greater than zero.");
            } else if (W > Wl) {
                System.out.println("Withdrawal: Denied - the withdrawal amount exceeds the daily limit for the " + AT + " tier of " + Wl + ".");
            } else {
                double fee = W * feePercentage / 100;
                double total = W + fee;
                if (AB >= total) {
                    AB -= total;
                    System.out.println("Withdrawal: Approved");
                    System.out.println("Transaction fee (" + feePercentage + "%): " + fee);
                    System.out.println("Total amount deducted: " + total);
                } else {
                    System.out.println("Withdrawal: Denied - the balance of " + AB + " is insufficient to cover the withdrawal and fee totaling " + total + ".");
                }
            }
        } else {
            System.out.println("Checking Account Security: Denied");
        }
        System.out.println("Account Balance: " + AB);
    }
}

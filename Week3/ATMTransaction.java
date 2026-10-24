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

            if (Wl > 0 && AB >= W && W <= Wl) {
                System.out.println("Withdrawal: Approved");
            } else {
                System.out.println("Withdrawal: Denied");
            }
        } else {
            System.out.println("Checking Account Security: Denied");
        }
        System.out.println("Account Balance: " + AB);
    }
}
/*
    @Author : Yohanze Obmerga
*/
package Week2;

public class GradeThreshold {
    public static void main(String[] var0) {
        int ave = 90/*74 uncomment to check if the student fails*/;
        int abs = 5/*3 uncomment to check for exact 3 absences */;

        boolean passed = (ave >= 75 && abs <= 3) || ave >= 90;

        System.out.println("Student passed: " + passed);
        /*This shows if the student passed */
        System.out.println("(average >= 75 and absences <= 3): " + (ave >= 75 && abs <= 3));
        System.out.println("(average >= 90, regardless of absences): " + (ave >= 90));
        /*This shows how the student passed if it was because they had an average of 90 above or 
        they had an average of 75 above and has 3 or less absences*/
    }
}

package Week2;

public class GradeThreshold {
    public static void main(String[] var0) {
        int ave = 90;
        int abs = 2;

        boolean passed = ave >= 90 || (ave >= 50 && abs <= 3);

        System.out.println(passed
                ? ave >= 90
                        ? "Student passed because the average is at least 90, regardless of absences."
                        : "Student passed because the average is at least 50 and absences are no more than 3."
                : "Student failed because "
                        + (ave < 50 && abs > 3
                                ? "the average is below 50 and absences exceed 3."
                                : ave < 50
                                        ? "the average is below 50."
                                        : "absences exceed 3."));
    }
}

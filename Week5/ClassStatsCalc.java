/*
    @Author : Yohanze Obmerga
*/
package Week5;

public class ClassStatsCalc {
    public static void main(String[] var0) {
        int[] grades = {78, 90, 85, 95, 83, 92, 81, 79};
        int gradesLength = grades.length;
        /*This sorts the grades*/
        for (int i = 0; i < gradesLength; i++) {
            for (int j = i + 1; j < gradesLength; j++) {
                if (grades[i] > grades[j]) {
                    int temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }

        int sum = 0;
        for (int k = 0; k < gradesLength; k++) {
            sum += grades[k];
        }

        int average = sum / gradesLength;

        System.out.println("The Student's grades were");
        for (int i = 0; i < gradesLength; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("The Sum of the Grades is " + sum);
        System.out.println("The Average of the Grades is " + average);
        System.out.println("The Lowest Grade is " + grades[0]);
        System.out.println("The Highest Grade is " + grades[gradesLength - 1]);
    }
}
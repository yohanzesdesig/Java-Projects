/*
    @Author : Yohanze Obmerga
*/
package Week5;

public class ClassStatsCalc {
    public static void main(String[] var0) {
        int[] grades = {78, 90, 85, 95, 83, 92, 81, 79};
        int gradesLength = grades.length;

        int sum = 0;
        int lowestGrade = grades[0];
        int highestGrade = grades[0];

        /*This loop checks for the highest and lowest grades by comparing each grades variable in the array and
        also adding each grades to get the sum */
        for (int k = 0; k < gradesLength; k++) {
            sum += grades[k];
            if (grades[k] < lowestGrade) {
                lowestGrade = grades[k];
            }
            if (grades[k] > highestGrade) {
                highestGrade = grades[k];
            }
        }

        int average = sum / gradesLength;

        System.out.println("The Sum of the Grades is " + sum);
        System.out.println("The Average of the Grades is " + average);
        System.out.println("The Lowest Grade is " + lowestGrade);
        System.out.println("The Highest Grade is " + highestGrade);
    }
}

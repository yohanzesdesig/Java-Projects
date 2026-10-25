/*
    @Author : Yohanze Obmerga
*/
package Week5;

public class ClassRanking {
    public static void main(String[] args) {
        String[] names = {"Yohan", "Mia", "Alex", "Noah", "Lia", "Sam"};
        int[][] rawQuizData = {
            {15, 12, 10, 12, 13},
            {14, 15, 13, 14, 15},
            {12, 14, 13, 15, 14},
            {10, 11, 13, 12, 14},
            {13, 13, 13, 13, 13},
            {12, 13, 14, 13, 13}
        };
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        sortByAverage(students);
        printLeaderboard(students);

        String searchName = "Yohan";
        int rank = findStudentRank(students, searchName);
        if (rank != -1) {
            System.out.println(searchName + "'s rank: " + rank);
        } else {
            System.out.println(searchName + " was not found.");
        }
    }
    /*this function uses the same logic as a linear sort but in a rudimentary code */
    private static void sortByAverage(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    private static void printLeaderboard(Student[] students) {
        System.out.println("Class Leaderboard");
        System.out.printf("%-8s %-12s %s%n", "Rank", "Student", "Average");
        int rank = 0;
        double previousAverage = Double.NaN;

        for (int i = 0; i < students.length; i++) {
            double average = students[i].getAverage();
            if (i == 0 || average != previousAverage) {
                rank = i + 1;
            }
            System.out.printf("%-8d %-12s %.2f%n", rank, students[i].getName(), average);
            previousAverage = average;
        }
    }
    /*this function is alinear search but in a more expanded manner*/
    private static int findStudentRank(Student[] students, String name) {
        int rank = 0;
        double previousAverage = Double.NaN;

        for (int i = 0; i < students.length; i++) {
            double average = students[i].getAverage();
            if (i == 0 || average != previousAverage) {
                rank = i + 1;
            }
            if (students[i].getName().equalsIgnoreCase(name)) {
                return rank;
            }
            previousAverage = average;
        }
        return -1;
    }
}
/*This class called "Student" stores each student and computes each quiz's average */
class Student {
    private final String name;
    private final int[] quizzes;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes.clone();
    }

    String getName() {
        return name;
    }

    double getAverage() {
        int total = 0;
        for (int score : quizzes) {
            total += score;
        }
        return (double) total / quizzes.length;
    }
}

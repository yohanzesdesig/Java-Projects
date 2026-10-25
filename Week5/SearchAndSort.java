/*
    @Author : Yohanze Obmerga
*/
package Week5;

import java.util.Arrays;

public class SearchAndSort {
    public static void main(String[] var0) {
        String[] Sc = {"Music", "Lazying Around", "Sleeping", "Movies", "Games"};
        String[] sortedSc = Arrays.copyOf(Sc, Sc.length);
        String searchFor = "Movies";
        int foundIndex = -1;

        for (int i = 0; i < Sc.length; i++) {
            if (Sc[i].equals(searchFor)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex >= 0) {
            System.out.println(searchFor + " found at index " + foundIndex);
        } else {
            System.out.println(searchFor + " was not found");
        }

        /*Sorting a copy changes the variable so by sorting a copy the array variables per
        number will be different which will change what variable will be searched*/
        Arrays.sort(sortedSc);
        System.out.println("Original array: " + Arrays.toString(Sc));
        System.out.println("Sorted array: " + Arrays.toString(sortedSc));
    }
}

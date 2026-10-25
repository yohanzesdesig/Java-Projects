/*
    @Author : Yohanze Obmerga
*/
package Week5;

public class FavThings {
    public static void main(String[] var0) {
        String[] favThings = {"Music", "Lazying Around", "Sleeping", "Movies", "Games"};

            for (int i = 0; i < favThings.length; i++) {

            System.out.println("My #" + (i + 1) + " favorite thing is: " + favThings[i]);
            
            }
        /*This shows the amount of variables in the array*/
        System.out.println("Total # of Favorites: " + favThings.length);
    }
}

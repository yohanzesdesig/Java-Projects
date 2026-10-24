package Week5;

public class FavThings {
    public static void main(String[] var0) {
    String[] favThings = {"Music", "Lazying Around", "Sleeping", "Movies", "Games"};
    int favThingsB = favThings.length;
    for(int i = 1; i <= 10; i++) {
        System.out.println("My #" + i + " favorite thing is: " + favThings[i - 1]);
        }
        System.out.println(favThingsB);
    }
}

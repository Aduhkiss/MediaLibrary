import java.util.Scanner;

public class MediaLib {
    // Main Method
    public static void start() {
       System.out.println("What type of media would you like to run?");
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       if(input.equals("song")) {
           System.out.println("It Works!");
        }
        else if (input.equals("book")) {
           System.out.println("It Works!"); 
        }
        else if (input.equals("movie")) {
           System.out.println("It Works!");
        }
        else {
           System.out.println("That Media cannot be found!");
       }
    }
    public static void main() {
        System.out.println("Welcome to your media Library");
        MediaRegistry MR = new MediaRegistry();
        PriceHandler PH = new PriceHandler();
        MR.registerMedia();
        start();
    }
}
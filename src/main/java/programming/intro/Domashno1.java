package programming.intro;

import java.util.Scanner;

public class Domashno1 {
    public static void main(String[] args) {
        System.out.println("Please enter your username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username + ".Entry accepted.");
        System.out.println("Please provide your hobby:");
        String hobby = scanner.nextLine();
        System.out.println(username + "," + " how cool is that!");

        // ctrl+alt+L - beautify code
    }
}

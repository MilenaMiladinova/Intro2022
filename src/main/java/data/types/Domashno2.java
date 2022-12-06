package data.types;

import java.util.Scanner;

public class Domashno2 {
    public static void main(String[] args) {

        // task1 - не разбирам условието

        //task2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name"); //Milena
        String firstName = scanner.nextLine();

        System.out.println("Enter your username"); //milena
        String userName = scanner.nextLine();

        System.out.println(firstName.equalsIgnoreCase(userName)); // output is true

        //task 3

        String food = "I love chocolate";
        int count = food.split("\\s").length;
        System.out.println(count); // count is 3

        //task4
        String mood = "Merry";
        String holiday = "Christmas";
        System.out.println(mood + " " + holiday + "!");


    }

}


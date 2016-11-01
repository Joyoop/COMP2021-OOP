package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Scanner;

/**
 * Created by Isaac on 10/29/16.
 */
public class PauseTest {
    public static void main(String args[]){

        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }

    public static boolean userInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean input2 = false;
        System.out.println("Would you want to buy it?: 1 for yes, 2 for no:");
        if (scanner.hasNextLine())
            input = scanner.nextLine(); // if there is another number
        else
            input = "";
        String input3 = scanner.nextLine();
        scanner.close();
        if (input == 1) {
            input2 = true;
        } else {
            input2 = false;
        }
        return input2;
    }
}

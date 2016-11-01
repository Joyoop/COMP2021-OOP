package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Isaac on 10/29/16.
            */
    public class PauseTest {
    //Scanner scanner = new Scanner(System.in);

    public static int initInput(){
        Scanner scanner = new Scanner(System.in);
        int input = 3;
        input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public static boolean userInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 3;
        boolean input2 = false;
        input = Integer.parseInt(scanner.nextLine());
        //String input3 = scanner.nextLine();
        //scanner.close();
        if (input == 1) {
            input2 = true;
        } else if(input == 2) {
            input2 = false;
        }
        return input2;
    }

    public static void closeScanner(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}

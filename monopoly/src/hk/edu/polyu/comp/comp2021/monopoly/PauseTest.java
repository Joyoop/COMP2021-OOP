package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Isaac on 10/29/16.
 * this class is used to figure out all user input problem
            */
    public class PauseTest {
    //Scanner scanner = new Scanner(System.in);

    public static void triggerDie(){
        System.out.printf("Press RETURN To tose a die...");
        new java.util.Scanner(System.in).nextLine();
    }

    public static int initInput(){
        Scanner scanner = new Scanner(System.in);
        int input  = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public static int[] aiInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] items = input.split(",");
        int[] result = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            try {
                result[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                //NOTE: write something here if you need to recover from formatting errors
            };
        }
        return result;
    }

    public static boolean userInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
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

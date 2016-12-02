package hk.edu.polyu.comp.comp2021.monopoly;

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
        int input = 0;
        try {
            input = Integer.parseInt(scanner.nextLine());

        }catch(NumberFormatException e){
            System.out.println("Please enter an Integer.");
        }
        return input;
    }

    public static int [] aiInput(int integer) {
        String input = Integer.toString(integer);
        String[] items = input.split("");
        //int[] test = new int[totalPlayer];
        /*
        try{
            for(int j = 0; j < items.length; j++){
                test[Integer.parseInt(items[j])] = 0;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AI No. should be within the totalplayer.");
        }
*/
        int[] result = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            try {
                result[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a sequence of numbers for AI players");
            }
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

    public static int userInput2(){
        Scanner scanner = new Scanner(System.in);
        int input;
        //boolean input2 = false;
        input = Integer.parseInt(scanner.nextLine());
        //String input3 = scanner.nextLine();
        //scanner.close();
        return input;
    }

    public static void closeScanner(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}

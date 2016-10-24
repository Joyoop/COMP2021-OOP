/**
 * Created by LX.Conan on 2016/10/23.
 */

import java.lang.*;

public class TestMain {
    // you should define two new instances using your own rabbit and tortoise classes
    // e.g. Rabbit rb = new Rabbit();
    public static void main(String[] args) {
        // your code here
        float targetDistance = 100;
        Rabbit Runner_Rabbit = new Rabbit("Bunny",5,1, 1/2);
        Tortoise Runner_Tortoise = new Tortoise("Tony",2,1);
        boolean printInterStateFlag = true;
        // modify all input params with proper name
        // @brief run the rabbit and tortoise games
        // @param Runner_Rabbit a rabbit instance defined by Rabbit class
        // @param Runner_Tortoise a tortoise instance defined by Tortoise class
        // @targetDistance the running distance, it should be larger than 0
        // @printInterStateFlag whether print intermediate state for all runners
        run(Runner_Rabbit, Runner_Tortoise, targetDistance, printInterStateFlag);
    }

    // do not modify
    public static void run(Runner inputRabbit, Runner inputTortoise, float targetDistance, boolean printInterState) {
        if (targetDistance <= 0f) {
            System.out.println("The running distance must be larger than zero");
            return;
        }
        int n = 0;
        while(true) {
            if (inputRabbit.getLocation() < targetDistance && inputTortoise.getLocation() < targetDistance) {
                inputRabbit.run();
                inputTortoise.run();

                // step = step + 1;
                n++;
                if (printInterState) {
                    if (inputRabbit.getLocation() > inputTortoise.getLocation()) {
                        System.out.println("step " + n + ": " + inputRabbit.getName() + " > " + inputTortoise.getName());
                    } else {
                        System.out.println("step " + n + ": " + inputRabbit.getName() + " < " + inputTortoise.getName());
                    }
                    inputRabbit.printCurrentState();
                    inputTortoise.printCurrentState();
                }
            } else {
                if (inputRabbit.getLocation() >= targetDistance && inputTortoise.getLocation() < targetDistance) {
                    System.out.println("rabbit name " + inputRabbit.name + " win !");
                } else if (inputTortoise.getLocation() >= targetDistance && inputRabbit.getLocation() < targetDistance) {
                    System.out.println("tortoise name " + inputTortoise.name + " win !");
                } else if (inputTortoise.getLocation() >= targetDistance && inputRabbit.getLocation() >= targetDistance) {
                    System.out.println("draw !");
                }
                return;
            }
        }
    }
}

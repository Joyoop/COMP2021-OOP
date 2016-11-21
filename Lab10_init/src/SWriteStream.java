/**
 * Created by Lx.Yang on 2016/11/13.
 */

import java.util.*;

public class SWriteStream implements Runnable {
    private SFileBuffer buffer = null;

    SWriteStream(SFileBuffer buffer) {
        // your code here
        this.buffer = buffer;
    }

    public void closeFile() {
        // your code here
    }

    public void writeMessage(String [] input){
        // your code here
        // the writeMessage() is an interface for SFileBuffer.writeMessage()

    }

    public void run() {
        // your code here
        // scanning the input from user, and writing the user's input to .txt file
        Scanner userInput = new Scanner(what here);
        System.out.println("Continue Writing ? [Y/N]");
        while (userInput.hasNext() && userInput.nextLine().equalsIgnoreCase("Y")) {
            // writing message here
            System.out.println("Continue Writing ? [Y/N]");
        }

        // maybe we need some return code here
        // if so, why ?
    }
}

/**
 * Created by LX.Conan on 2016/11/20.
 */

import java.io.*;

public class SFileBuffer {
    private int currNumLines = 0;
    private RandomAccessFile file = null;


    SFileBuffer() {
        // your code here
        // you should check the RandomAccessFile class and use the right open mode
        file = new RandomAccessFile(args);
    }

    public type closeFile() {
        // your code here
    }

    // return the number of lines in current files
    public type getCurrNumLines() {
        // your code here
    }

    public void countLines() {
        // count the lines in current files
        // currNumLines = your code for counting
    }

    public type getLine(int line) {
        // your code here
        // if currNumLines = 0 or currNumLines < the input line
        // wait for the writing operation.
        // otherwise get a message from the file and return it
    }

    public void writeMessage() {
        // your code here
        // do not forget to change the number of current lines
    }

    public void printBufferSize() {
        System.out.println("Number of Lines: " + currNumLines);
    }
}

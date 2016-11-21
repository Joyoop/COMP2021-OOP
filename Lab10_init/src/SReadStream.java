/**
 * Created by Lx.Yang on 2016/11/20.
 */

import java.io.*;

public class SReadStream implements Runnable {
    private FileBuffer buffer = null;

    SReadStream(The input should be a shared buffer) {
        // your code here
    }

    public void closeFile() {
        // your code here
    }

    public void run() {
        // using Math.random() * max_number to generate number ranged from [0, max_number]
        // and input the random number to buffer.getLine(random_number) to get a message
        // and print the message.
        // do not forget to use try ... catch pattern.
        for (int i=0; i<100; ++i) {
            // your code here
            // print the message
        }
    }
}

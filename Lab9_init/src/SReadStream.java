/**
 * Created by Lx.Yang on 2016/11/13.
 *
 * The SReadStream class will read all messages stored in a .txt
 * file, and print out all messages.
 *
 * Note: you should use StreamBuffer
 */

import java.io.IOException;
import java.util.*;
//import java.OpenMp;

public class SReadStream implements Runnable {
    private StreamBuffer buffer = new StreamBuffer();
    private String filename = null;

    public SReadStream(String filename, StreamBuffer b) {
        this.filename = filename;
        this.buffer = b;
    }

    /**
     *  Override run method
     *
     *  Read all lines from a file (filename), and print all contents
     *  in this file out.
     *
     *  Note: Please refer to Files.readAllLines(), and Paths.get().
     *  Your should include related packages to use above method. Please
     *  check it by yourself.
     */
    public void run() {
        // your code here
        while(!buffer.getMessage().isEmpty()){
            System.out.println(buffer.getMessage());
        }
    }
}

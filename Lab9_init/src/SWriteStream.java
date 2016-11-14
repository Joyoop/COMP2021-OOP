/**
 * Created by Lx.Yang on 2016/11/13.
 *
 * The SWriteStream class will write some messages into a .txt
 *
 * Note: you should use StreamBuffer
 */

import java.io.*;

public class SWriteStream implements/extends Runnable/Thread {
    private FileWriter file = null;
    private String filename = null;
    private StreamBuffer buffer = new StreamBuffer();

    public SWriteStream(String filename, StreamBuffer b) {
        // your code here
    }

    // you might use FileWriter class, please check all methods.
    public void openFile(String filename) {
    }

    // always close file if we do not need it.
    public void closeFile()  {
        // your code here
    }

    public void createSomeMessage(int messageSize) {
        for (int i = 0; i<messageSize; ++i) {
            // you can change the message by yourself.
            buffer.addMessage("message id :" + i + "\n");
        }
    }

    /**
     * writeAllBufferToFile
     *  Write all messages in current buffer to a .txt file.
     *
     *  Use getter method in Buffer to return a string, You might
     *  use write method in FileWriter class.
     */
    syn void writeAllBufferToFile() {
        // your code here
    }

    /**
     *  Override run method
     *  OpenFile -> writeAllBufferToFile -> CloseFile
     */
    public void run() {
    }
}

/**
 * Created by Lx.Yang on 2016/11/13.
 *
 * The SWriteStream class will write some messages into a .txt
 *
 * Note: you should use StreamBuffer
 */

import java.io.*;

public class SWriteStream implements Runnable {
    private FileWriter file = null;
    private String filename = null;
    private StreamBuffer buffer = new StreamBuffer();

    public SWriteStream(String filename, StreamBuffer b) {
        // your code here
        this.filename = filename;
        this.buffer = b;
        createSomeMessage(10);
    }

    // you might use FileWriter class, please check all methods.
    public synchronized void openFile(String filename) {
        //String eResult = null;
        try {
            file = new FileWriter(filename);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(file);
    }

    // always close file if we do not need it.
    public synchronized void closeFile()  {
        // your code here
        try{
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public synchronized void createSomeMessage(int messageSize) {
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
    public synchronized void writeAllBufferToFile() {
        // your code here
        //int i = 0;

        int temp = buffer.getBufferSize();
        //System.out.println("wrieAllBufferToFile");
        for(int i = 0; i < temp; i++){
            try {
                String test = buffer.getMessage(i);
                file.write(test);
                //System.out.println(test);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     *  Override run method
     *  OpenFile -> writeAllBufferToFile -> CloseFile
     */
    public void run() {
        openFile(this.filename);
        writeAllBufferToFile();
        closeFile();
    }
}

/**
 * Created by LX.Conan on 2016/11/20.
 */

import java.io.*;

public class SFileBuffer {
    private int currNumLines = 0;
    private RandomAccessFile file = null;


    SFileBuffer(File file) {
        // your code here
        // you should check the RandomAccessFile class and use the right open mode
        try {
            this.file = new RandomAccessFile(file, "rws");
        }catch(FileNotFoundException e){

        }
        this.countLines();
    }

    public void closeFile() {
        // your code here
        try {
            this.file.close();
        }catch(IOException e){

        }
    }

    // return the number of lines in current files
    public long getCurrNumLines() {
        // your code here
        return this.currNumLines;
    }

    public void countLines() {
        // count the lines in current files
        // currNumLines = your code for counting
        try {
            while (this.file.readLine() != null) {
                this.currNumLines ++;
            }
            file.seek(0);
        }catch(IOException e){

        }
    }

    public String getLine(int line) {
        // your code here
        // if currNumLines = 0 or currNumLines < the input line
        // wait for the writing operation.
        // otherwise get a message from the file and return it
        String result = "not read yo";
        while(currNumLines == 0 || currNumLines < line){
           try{ wait();} catch(InterruptedException e){}
        }

        try{
            for(int i = 0; i < line -1; i++) {
                result = this.file.readLine();
            }
            result = this.file.readLine();
        } catch(IOException e){}

        return result;
    }

    public void writeMessage() {
        // your code here
        // do not forget to change the number of current lines

    }

    public void printBufferSize() {
        System.out.println("Number of Lines: " + currNumLines);
    }
}

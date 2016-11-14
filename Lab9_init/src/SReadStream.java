/**
 * Created by Isaac on 11/14/16.
 */
public class SReadStream implements Runnable{
    private StreamBuffer buffer;
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
        int temp = buffer.getBufferSize();
        System.out.println(temp);
        String temp2;
        for(int i = 0; i < temp; i++){
            temp2 = buffer.getMessage();
            System.out.println(temp2);
            System.out.println("I am with Stupid");
        }
    }
}

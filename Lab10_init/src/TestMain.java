/**
 * Created by Lx.Yang on 2016/11/13.
 */

import java.io.IOException;


public class TestMain {
    // your code here
    public static void main(String args[]) {
        SFileBuffer buffer = new SFileBuffer("test.txt");
        (new Thread(new SReadStream(buffer))).start();
        (new Thread(new SWriteStream(buffer))).start();
    }
}

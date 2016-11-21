/**
 * Created by Lx.Yang on 2016/11/13.
 */

import java.io.IOException;


public class TestMain {
    // your code here
    public static void main(String args[]) {
        SFileBuffer buffer = new SFileBuffer(yourfilename);
        (new Thread(new SReadStream(buffer))).start();
        (new Thread(new SWriteStream(buffer))).start();
    }
}

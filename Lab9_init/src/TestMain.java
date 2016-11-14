/**
 * Created by Lx.Yang on 2016/11/13.
 *
 * If all classes are right, the following code will print some messages.
 * The printed messages are the same to what you write in your .txt file.
 *
 * Note: please change the filename to "your_filename.txt"
 */
public class TestMain {
    public static void main(String args[]) {
       StreamBuffer b = new StreamBuffer();
        String filename = "test";
       (new Thread(new SWriteStream(filename, b))).start();
       (new Thread(new SReadStream(filename, b))).start();
    }
}

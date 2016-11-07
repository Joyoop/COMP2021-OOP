/**
 * Created by LX.Conan on 2016/11/7.
 */

import java.util.Vector;

public class SFile {

    // do not modify
    SFile() {
        filename = "Null";
        contents = new Vector<String>(0);
    }

    // create your own constructor
    SFile(arg1 or more) {
    }

    /**
     *  Create a FileObject
     *  @param filename input filename for new file
     */
    public void create(String filename) {
    }

    // overload create with two params
    // sz is the initial size of contents
    public void create(String filename, int sz) {
        // your code here
    }

    public void addContent(String content) {
        // your code here
        // add content after the end of current file
    }

    public void setFileSize(int sz) {
        // your code here
        // reset the size of current file
    }

    public void setFileName(String filename) {
        // your code here
        // rename the current file
    }

    // put your own comments here (javadoc style)
    public int getFileSize() {
        // your code here
    }

    // put your own comments here
    public String getFileName() {
        // your code here
    }

    public String getContent(int contentIndex) {
        // your code here
        // the contentIndex should be smaller than max size of
        // current file
    }

    public void copyTo(SFile rhs) {
        // your code here
    }

    // put your own comments here
    public void swapContents(int index0, int index1) {
        // your code here
    }

    // put your own comments here
    public void deleteContent(int contentIndex) {
        // your code here
        // use if to delete all contents (e.g. contentIndex == -1
        // clear all).
    }

    public void deleteAll() {
        // your code here
        // delete all things
    }

    private/protected/public String filename;
    private/protected/public Vector<String> contents;
}

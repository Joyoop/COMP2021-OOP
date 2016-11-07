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
    SFile(String filename, Vector<String> contents) {
        this.filename = filename;
        this.contents = contents;
    }

    /**
     *  Create a FileObject
     *  @param filename input filename for new file
     */
    public void create(String filename) {
        this.filename = filename;
    }

    // overload create with two params
        // sz is the initial size of contents
    public void create(String filename, int sz) {
        // your code here
        this.contents.setSize(sz);
        this.filename = filename;
    }

    public void addContent(String content) {
        // your code here
        // add content after the end of current file
        this.contents.add(content);
    }

    public void setFileSize(int sz) {
        // your code here
        // reset the size of current file
        this.contents.setSize(sz);
    }

    public void setFileName(String filename) {
        // your code here
        // rename the current file
        this.filename = filename;
    }

    // put your own comments here (javadoc style)
    /**
     * return the size of current file
     * @return filesize size of current file in int
     */
    public int getFileSize() {
        // your code here
        return this.contents.size();
    }

    // put your own comments here
    public String getFileName() {
        // your code here
        return this.filename;
    }

    public String getContent(int contentIndex) {
        // your code here
        // the contentIndex should be smaller than max size of
        // current file
        if(contentIndex <= this.contents.size()){
            return this.contents.get(contentIndex);
        }else{
            return null;
        }
    }

    public void copyTo(SFile rhs) {
        // your code here
        rhs = new SFile(this.filename,this.contents);
    }

    // put your own comments here
    public void swapContents(int index0, int index1) {
        // your code here
        Vector<String> temp1 = this.contents;
        String temp = temp1.get(index0);
        temp1.set(index0,temp1.get(index1));
        temp1.set(index1,temp);

    }

    // put your own comments here
    public void deleteContent(int contentIndex) {
        // your code here
        // use if to delete all contents (e.g. contentIndex == -1
        // clear all).
        if(this.contents.get(contentIndex) != null){
            this.contents.remove(contentIndex);
        }
    }

    public void deleteAll() {
        // your code here
        // delete all things
        if(!this.contents.isEmpty()){
            this.contents.removeAllElements();
        }
    }

    private String filename;
    private Vector<String> contents;
}

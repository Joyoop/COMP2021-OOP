/**
 * Created by LX.Conan on 2016/11/7.
 */

import java.util.Vector;

public class SDocument {

    // do not modify
    SDocument() {
        files = new Vector<SFile>(0);
    }

    SDocument(SFile file) {
        // your code here
    }


    public void create(SFile file) {
        // your code here
    }

    public void addFile(SFile file) {
        // your code here
    }

    public void setDocumentSize(int sz) {
        // your code here
    }

    public void setDocumentName(String documentName) {
        // your code here
    }

    public int getDocumentSize() {
        // your code here
    }

    public String getDocumentName() {
        // your code here
    }

    public SFile getFile(int fileIndex) {
        // your code here
    }

    public void copyTo(SDocument rhs) {
        // your code here
    }

    // put your own comments here
    public void swapContents(int index0, int index1) {
        // your code here
    }

    // put your own comments here
    public void deleteFile(int fileIndex) {
        // your code here
    }

    public void deleteAll() {
        // your code here
    }

    private String documentName;
    private Vector<SFile> files;
}

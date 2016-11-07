/**
 * Created by LX.Conan on 2016/11/7.
 */

import java.util.Vector;

public class SFolder {
    SFolder() {
        folders = new Vector<SDocument>(0);
    }

    SFolder(SDocument document) {
        // your code here
    }


    public void create(SDocument document) {
        // your code here
    }

    public void addDocument(SDocument document) {
        // your code here
    }

    public void setFolderSize(int sz) {
        // your code here
    }

    public void setFolderName(String folderName) {
        // your code here
    }

    public int getFolderSize() {
        // your code here
    }

    public String getFolderName() {
        // your code here
    }

    public sig getDocument(int documentIndex) {
        // your code here
    }

    public void copyTo(SFolder rhs) {
        // your code here
    }

    // put your own comments here
    public void swapDocument(int index0, int index1) {
        // your code here
    }

    // put your own comments here
    public void deleteDocument(int documentIndex) {
        // your code here
    }

    public void deleteAll() {
        // your code here
    }

    private/protected/public String folderName;
    private/protected/public Vector<SDocument> folders;
}

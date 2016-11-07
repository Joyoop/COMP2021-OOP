/**
 * Created by Isaac Shi on 2016/11/7.
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
        return this.folders.size();
    }

    public String getFolderName() {
        // your code here
        return this.folderName;
    }

    public SDocument getDocument(int documentIndex) {
        // your code here
        return this.folders.get(documentIndex);
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

    private String folderName;
    private Vector<SDocument> folders;
}

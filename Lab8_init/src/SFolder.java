/**
 * Created by Isaac Shi on 2016/11/7.
 */

import java.util.Vector;

public class SFolder {
    SFolder() {
        folders = new Vector<SDocument>(0);
    }

    SFolder(SDocument document, String name) {
        // your code here
        this.folderName = name;
        this.folders.add(document);
    }


    public void create(SDocument document) {
        // your code here
    }

    public void addDocument(SDocument document) {
        // your code here
        this.folders.add(document);
    }

    public void setFolderSize(int sz) {
        // your code here
        this.folders.setSize(sz);
    }

    public void setFolderName(String folderName) {
        // your code here
        this.folderName = folderName;
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
        rhs = new SFolder();
        rhs.setFolderName(this.folderName);
        for(int i = 0; i < this.folders.size(); i++) {
            rhs.folders.add(this.folders.get(i));
        }
    }

    // put your own comments here
    public void swapDocument(int index0, int index1) {
        // your code here
        Vector<SDocument> tmp = this.folders;
        SDocument temp = tmp.get(index0);
        tmp.set(index0,tmp.get(index1));
        tmp.set(index1,temp);
    }

    // put your own comments here
    public void deleteDocument(int documentIndex) {
        // your code here
        this.folders.remove(documentIndex);
    }

    public void deleteAll() {
        // your code here
        if(!this.folders.isEmpty()){
            this.folders.clear();
        }
    }

    private String folderName;
    private Vector<SDocument> folders;
}

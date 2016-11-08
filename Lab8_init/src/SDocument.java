/**
 * Created by Isaac Shi on 2016/11/7.
 */

import java.util.Vector;

public class SDocument {

    // do not modify
    SDocument() {
        files = new Vector<SFile>(0);
    }

    SDocument(SFile file, String filename) {
        // your code here
        this.documentName = filename;
        this.files.add(file);
    }


    public void create(SFile file) {
        // your code here
        this.files.add(file);
    }

    public void addFile(SFile file) {
        // your code here
        this.files.add(file);
    }

    public void setDocumentSize(int sz) {
        // your code here
        this.files.setSize(sz);
    }

    public void setDocumentName(String documentName) {
        // your code here
        this.documentName = documentName;
    }

    public int getDocumentSize() {
        // your code here
        return this.files.size();
    }

    public String getDocumentName() {
        // your code here
        return this.documentName;
    }

    public SFile getFile(int fileIndex) {
        // your code here
        return this.files.get(fileIndex);
    }

    public void copyTo(SDocument rhs) {
        // your code here
        rhs = new SDocument();
        rhs.documentName = this.documentName;
        for(int i = 0; i < this.files.size(); i++) {
            rhs.files.add(this.files.get(i));
        }
    }

    // put your own comments here
    public void swapContents(int index0, int index1) {
        // your code here
        Vector<SFile> tmp = this.files;
        SFile temp = tmp.get(index0);
        tmp.set(index0,tmp.get(index1));
        tmp.set(index1,temp);

    }

    // put your own comments here
    public void deleteFile(int fileIndex) {
        // your code here
        this.files.remove(fileIndex);
    }

    public void deleteAll() {
        // your code here
        if(!this.files.isEmpty()){
            this.files.clear();
        }
    }

    private String documentName;
    private Vector<SFile> files;
}

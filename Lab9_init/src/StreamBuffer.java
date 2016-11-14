/**
 * Created by LX.Conan on 2016/11/13.
 */

import java.util.*;

/**
 * Task-1: This task is very similar to the "buffer" class in
 * Lecture-10. Please refer to the lecture.
 */

public class StreamBuffer {

    private List<String> messages = new LinkedList<String>();
    //private final int maxSize = 5;

    public StreamBuffer() {
        this.messages = new LinkedList<String>();
        //this.maxSize = 5;
    }

    /**
     * What is syn, please complete the word and think about
     * Why we need syn here ?
     *
     * This method should get a message. please use wait()
     * and notify (or notifyAll), and think about the reasons.
     *
     * Note: this method is similar to Buffer.take() in lecture-10
     */
    public synchronized String getMessage() {
        // your code here
        while(this.messages.isEmpty() || this.messages.size() < 10){
            try{
                wait();
            }catch (InterruptedException e){

            }
        }
        String temp = messages.remove(0);
        System.out.println(temp);
        notifyAll();
        return temp;
    }

    /**
     * An overloaded getMessage method.
     *
     * This method will return a message with given index.
     * Please refer to another getMessage to code it.
     */
    public synchronized String getMessage(int index) {
        // your code here
        while(!this.messages.isEmpty() || this.messages.size() < index){
            try{
                wait();
            }catch (InterruptedException e){

            }
        }
        String temp = messages.get(index);
        notifyAll();
        return temp;
    }


    // a size getter function
    public synchronized int getBufferSize() {
        // your code here
        return this.messages.size();
    }

    /**
     *
     * This method should add a message into message_list.
     * please use notify or notifyAll, and think about the reasons.
     *
     * Note: this method is similar to Buffer.put() in lecture-10
     */
    public synchronized void addMessage(String msg) {
        // your code here
        messages.add(msg);
        //System.out.println(msg);
        notifyAll();
    }
}

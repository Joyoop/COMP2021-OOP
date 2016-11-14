/**
 * Created by LX.Conan on 2016/11/13.
 */

import java.util.*;

/**
 * Task-1: This task is very similar to the "buffer" class in
 * Lecture-10. Please refer to the lecture.
 */

public class StreamBuffer {

    modifier List<String> messages = new LinkedList<String>();

    public StreamBuffer() {
        this.messages = new LinkedList<String>();
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
    public syn String getMessage() {
        // your code here
        return some_string
    }

    /**
     * An overloaded getMessage method.
     *
     * This method will return a message with given index.
     * Please refer to another getMessage to code it.
     */
    public syn String getMessage(int index) {
        // your code here
    }


    // a size getter function
    public syn int getBufferSize() {
        // your code here
    }

    /**
     *
     * This method should add a message into message_list.
     * please use notify or notifyAll, and think about the reasons.
     *
     * Note: this method is similar to Buffer.put() in lecture-10
     */
    public syn void addMessage(str msg) {
        // your code here
    }
}

/**
 * Created by LX.Conan on 2016/10/15.
 */

import java.lang.Math; // for math methods

// Task-2 Rectangle Class
public class Rectangle {
    public static void main() {
        // your code here
    }

    // constructor. Do not modified this
    Rectangle() {
        this.topLeft = new Point();
        this.bottomRight = new Point();
    }

    // constructor. please implement your own constructor
    Rectangle(Point topLeft, Point bottomRight) {
        // your code here
    }

    // setter method for top-left
    // please use Point class as input
    public void setTopLeft() {
        // your code here
    }

    // setter method for bottom-right
    // please use Point class as input
    public void setBottomRight() {
        // your code here
    }

    // getter method for top-left
    public Point getTopLeft(){
        // your code here
    }

    // getter method for bottom-right
    public Point getBottomRight() {
        // your code here
    }

    // calculate the area of current rectangle
    public double area () {
        // your code here
    }

    // printer method
    public void print() {
    }

    // extra task
    // if you finish all tasks, please un-comment following
    // code and finish it if you like
    // public double intersection (Rectangle rhs) {
    //    // your code here
    // }


    // the two points.
    // choose one of them in parentheses
    (private / protected / public) Point topLeft;
    (private / protected / public) Point bottomRight;
}

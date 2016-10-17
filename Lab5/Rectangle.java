/**
 * Created by LX.Conan on 2016/10/15.
 */

import java.lang.Math; // for math methods

// Task-2 Rectangle Class
public class Rectangle {
    public static void main(String[] args) {
        // your code here
        Point x = new Point(1.0,1.0);
        Point y = new Point(2.0,2.0);
        Rectangle z = new Rectangle();
        z.setTopLeft(x);
        z.setBottomRight(y);
        z.print();
        System.out.println(z.area());
    }

    // constructor. Do not modified this
    Rectangle() {
        this.topLeft = new Point();
        this.bottomRight = new Point();
    }

    // constructor. please implement your own constructor
    Rectangle(Point topLeft, Point bottomRight) {
        // your code here
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // setter method for top-left
    // please use Point class as input
    public void setTopLeft(Point x) {
        // your code here
        this.topLeft = x;
    }

    // setter method for bottom-right
    // please use Point class as input
    public void setBottomRight(Point y) {
        // your code here
        this.bottomRight = y;
    }

    // getter method for top-left
    public Point getTopLeft(){
        // your code here
        return this.topLeft;
    }

    // getter method for bottom-right
    public Point getBottomRight() {
        // your code here
        return this.bottomRight;
    }

    // calculate the area of current rectangle
    public double area () {
        // your code here
        double dx = this.topLeft.getCoord0() - this.bottomRight.getCoord0();
        double dy = this.topLeft.getCoord1() - this.bottomRight.getCoord1();
        double x = dx*dy;
        return x;
    }

    // printer method
    public void print() {
        System.out.println("("+ topLeft.print() + "," + bottomRight.print() + ")");
    }

    // extra task
    // if you finish all tasks, please un-comment following
    // code and finish it if you like
    // public double intersection (Rectangle rhs) {
    //    // your code here
    // }


    // the two points.
    // choose one of them in parentheses
    private Point topLeft;
    private Point bottomRight;
}

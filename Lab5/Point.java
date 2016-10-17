/**
 * Created by LX.Conan on 2016/10/15.
 */

// you might use the method Math.sqrt()
import java.lang.Math; // for math methods

// Task-1 Point Class (Task-3)
public class Point {

    public static void main() {
        // your code here
        Point x = (3,5);
        Point y = (1,3);
        print(x);
        print(y);

    }

    // default constructor. Do not modified this
    Point() {
        this.coord0 = 0;
        this.coord1 = 0;
    }

    // please implement your own constructor
    Point(double x, double y) {
        this.x = coord0;
        this.y = coord1;
    }

    // setter method.
    public void setPoint(args1, args2) {
        // your code here
        x = arg1;
        y = arg2;
    }

    // setter method for the first coordinate
    public void setCoord0(arg) {
        // your code here
        x = arg;
    }

    // setter method for the second coordinate
    public void setCoord1(arg) {
        // your code here
        y = arg;
    }

    // getter method for the point
    public Point getPoint() {
        // your code here
        return (x, y)
    }

    // getter method for the first coordinate
    public int getCoord0() {
        // your code here
        return x;
    }

    // getter method for the second coordinate
    public int getCoord1() {
        // your code here
        return y;
    }

    // calculate distance from another point
    public double distanceTo(int coord0, int coord1) {
        // your code here
        double dx = this.x - coord0;
        double dy = this.x - coord1;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // another method for distance calculation
    // using the Point class as input
    public double distanceTo(Point rhs) {
        // your code here
        double dx = this.x - rhs.x;
        double dy = this.y - rhs.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // print all coordinates
    public void print() {
        // your code here
        return "(" + x + ", " + y + ")";
    }

    // the two coordinates index for point
    // choose one of them in parentheses
    private double coord0;
    private double coord1;
}

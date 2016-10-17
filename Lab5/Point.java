/**
 * Created by LX.Conan on 2016/10/15.
 */

// you might use the method Math.sqrt()
import java.lang.Math; // for math methods

// Task-1 Point Class (Task-3)
public class Point {

    public static void main(String[] args) {
        // your code here
        Point x = new Point();
        Point y = new Point();
        x.setCoord0(1.0);
        x.setCoord1(1.0);
        y.setCoord0(2.0);
        y.setCoord1(2.0);
        x.print();
        y.print();
        x.getPoint().print();
        System.out.println(x.distanceTo(y));
        System.out.println(x.getCoord0());
        System.out.println(y.getCoord1());

    }

    // default constructor. Do not modified this
    Point() {
        this.coord0 = 0;
        this.coord1 = 0;
    }

    // please implement your own constructor
    Point(double coord0, double coord1) {
        this.coord0 = coord0;
        this.coord1 = coord1;
    }

    // setter method.
    public void setPoint(double x, double y) {
        // your code here
        this.coord0 = x;
        this.coord1 = y;
    }

    // setter method for the first coordinate
    public void setCoord0(double x) {
        // your code here
        this.coord0 = x;
    }

    // setter method for the second coordinate
    public void setCoord1(double y) {
        // your code here
        this.coord1 = y;
    }

    // getter method for the point
    public Point getPoint() {
        // your code here
        return new Point(this.coord0, this.coord1);
    }

    // getter method for the first coordinate
    public double getCoord0() {
        // your code here
        return coord0;
    }

    // getter method for the second coordinate
    public double getCoord1() {
        // your code here
        return this.coord1;
    }

    // calculate distance from another point
    public double distanceTo(int coord0, int coord1) {
        // your code here
        double dx = this.coord0 - coord0;
        double dy = this.coord1 - coord1;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // another method for distance calculation
    // using the Point class as input
    public double distanceTo(Point rhs) {
        // your code here
        double dx = this.coord0 - rhs.coord0;
        double dy = this.coord1 - rhs.coord1;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // print all coordinates
    public void print() {
        // your code here
        System.out.println("(" + coord0 + ", " + coord1 + ")");
    }

    // the two coordinates index for point
    // choose one of them in parentheses
    private double coord0;
    private double coord1;
}

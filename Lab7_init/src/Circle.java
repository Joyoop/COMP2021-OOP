/**
 * Created by LX.Conan on 2016/10/30.
 */

import java.lang.Math;

public class Circle extends Shape {

    // do not modify
    Circle() {
        radius = 0;
    }

    Circle(arg1) {
        // your code here
    }

    static final int kParamR = what value ?

    // override Shape.setParam
    public void setParam(arg1, arg2) {
        // your code here
        // note: please refer the similar method in Rectangle
    }

    // overload this.setParam why
    public void setParam(int paramName, double paramValue) {
        // your code here
    }

    // override Shape.getParam
    public sig getParam(arg1) {
        // your code here
    }

    // overload this.getParam why ?
    public sig getParam() {
        // your code here
    }

    // area = Math.PI * r * r
    public sig area() {
        // your code here
    }

    // override Shape.printShape
    public void printShape() {
        // your code here
    }

    // override Shape.printArea
    public void printArea() {
        // your code here
    }

    // multiple reference
    public Shape clone() {
        // your code here
    }

    // deep clone
    public Shape copy() {
        // your code here
    }

    // choose one of three modifier
    private/protected/public double radius;
}

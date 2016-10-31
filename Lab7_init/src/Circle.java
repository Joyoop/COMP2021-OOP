/**
 * Created by LX.Conan on 2016/10/30.
 */

import java.lang.Math;

public class Circle extends Shape {

    // do not modify
    Circle() {
        radius = 0;
    }

    Circle(double arg1) {
        // your code here
        this.radius = arg1;
    }

    static final int kParamR = 0;

    // override Shape.setParam
    public void setParam(int arg1, String arg2) {
        // your code here
        // note: please refer the similar method in Rectangle
        switch (arg1){
            case kParamR: this.radius = Double.parseDouble(arg2); break;
        }
    }

    // overload this.setParam why
    public void setParam(int arg1, double arg2) {
        // your code here
        switch (arg1){
            case kParamR: this.radius = arg2; break;
        }
    }

    // override Shape.getParam
    public double getParam(int arg1) {
        // your code here
        return getParam();
    }

    // overload this.getParam why ?
    public double getParam() {
        // your code here
        return this.radius;
    }

    // area = Math.PI * r * r
    public double area() {
        // your code here
        return this.radius*this.radius*Math.PI;
    }

    // override Shape.printShape
    public void printShape() {
        // your code here
        System.out.println("Radius: "+this.radius);

    }

    // override Shape.printArea
    public void printArea() {
        // your code here
        System.out.println("Area: "+this.area());
    }

    // multiple reference
    public Shape clone() {
        // your code here
        return this;
    }

    // deep clone
    public Shape copy() {
        // your code here
        double r1 = this.radius;
        return new Circle(r1);
    }

    // choose one of three modifier
    private double radius;
}

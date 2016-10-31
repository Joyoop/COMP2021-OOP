/**
 * Created by LX.Conan on 2016/10/30.
 */

import javafx.scene.shape.RectangleBuilder;

import java.lang.Math;

public class Rectangle extends Shape {

    // do not modify
    Rectangle() {
        x = 0; y = 0;
        w = 0; h = 0;
    }

    // define your own constructor
    // Note: please represent the rectangle as [x y w h]
    // (x y) are the start coordinates of rectangle
    // (w h) are the width and height of rectangle, respectively
    Rectangle(double arg1, double arg2, double arg3, double arg4) {
        // your code here
        this.x = arg1;
        this.y = arg2;
        this.w = arg3;
        this.h = arg4;

    }

    // do not modify
    public static final int kParamX = 0;
    public static final int kParamY = 1;
    public static final int kParamW = 2;
    public static final int kParamH = 3;

    // override Shape.setParam
    // Double.parseDouble(String) convert a String into double value
    // do not modify
    public void setParam(int paramName, String paramValue) {
        switch(paramName)
        {
            case kParamX: this.x = Double.parseDouble(paramValue); break;
            case kParamY: this.y = Double.parseDouble(paramValue); break;
            case kParamW: this.w = Double.parseDouble(paramValue); break;
            case kParamH: this.h = Double.parseDouble(paramValue); break;
            default: System.out.println("error param name in Rectangle class"); return;
        }
    }

    // overloaded another setParam
    // the input params are: paramName, paramValue.
    // please change the type of paramValue from String to double
    public void setParam(int paramName, double paramValue) {
        // your code here (similar to above setParam)
        switch(paramName)
        {
            case kParamX: this.x = paramValue; break;
            case kParamY: this.y = paramValue; break;
            case kParamW: this.w = paramValue; break;
            case kParamH: this.h = paramValue; break;
            default: System.out.println("error param name in Rectangle class"); return;
        }
    }

    // override Shape.getParam
    // do not modify
    public double getParam(int paramName) {
        switch(paramName)
        {
            case kParamX: return x;
            case kParamY: return y;
            case kParamW: return w;
            case kParamH: return h;
            default: System.out.println("error param name in Rectangle class"); return -100000;
        }
    }

    // override Shape.area
    public double area() {
        // your code here
        return this.w*this.h;
    }

    // print [x y w h] information
    public void printShape() {
        // your code here
        System.out.println("["+x+""+y+""+w+""+h+"]");
    }

    // print area value
    public void printArea() {
        // your code here
        System.out.println("area value: "+this.area());
    }

    // multiple reference
    public Shape clone() {
        // your code here
        return this;
    }

    // deep clone
    public Shape copy() {
        // your code here
        double x1 = this.x;
        double y1 = this.y;
        double w1 = this.w;
        double h1 = this.h;

        return new Rectangle(x1,y1,w1,h1);
    }

    // choose one of three modifier
    private double x, y, w, h;
}

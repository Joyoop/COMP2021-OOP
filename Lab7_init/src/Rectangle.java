/**
 * Created by LX.Conan on 2016/10/30.
 */

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
    Rectangle(arg1, arg2, arg3, arg4) {
        // your code here
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
    public sig area() {
        // your code here
    }

    // print [x y w h] information
    public void printShape() {
        // your code here
    }

    // print area value
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
    private/protected/public double x, y, w, h;
}

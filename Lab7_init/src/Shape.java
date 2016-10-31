/**
 * Created by LX.Conan on 2016/10/30.
 */

// You should implement all following methods in sub-classes
public abstract class Shape {
    // @brief for multiple reference.
    //      e.g if Shape x = (Shape) y.clone(), x y have the same reference.
    public abstract Shape clone();

    // @brief for deep copy an object
    //      e.g if Shape x = (Shape) y.copy(), changing value in x will not
    //      influence any values in y
    public abstract Shape copy();

    // @brief set params for any given class (Rectangle or Circle)
    // @param paramName param name
    // @param paramValue param value
    public abstract void setParam(int paramName, String paramValue);

    // @brief get param value in any given class
    // @param paramName which param should be checked
    // @return a double value
    public abstract double getParam(int paramName);

    // @brief calculating area for any given class
    // @return a double value
    public abstract double area();

    // @brief print shape information
    public abstract void printShape();

    // @brief print the area
    public abstract void printArea();
}

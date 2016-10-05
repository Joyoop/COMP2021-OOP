package hk.edu.polyu.comp.comp2021.assignment2;

public class Complex {

    // Task 4: add the missing fields
    private final double re;   // the real part
    private final double im;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    // return a string representation of the invoking Complex object
    public String asString() {
        if (im == 0)
            return re + "";
        if (re == 0)
            return im + "i";
        if (im <  0)
            return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

    // return a new Complex object whose value is (this + b)
    public Complex add(Complex b) {
        Complex a = this;             // invoking object
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    // return a new Complex object whose value is (this * b)
    public Complex multiply(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }


    // return the real or imaginary part
    public double re() { return re; }
    public double im() { return im; }


    // sample client for testing
    public static void main(String[] args) {
        Complex a = new Complex(5.0, -6.0);
        Complex b = new Complex(-3.0, 4.0);

        System.out.println("a = " + a.asString());
        System.out.println("b = " + b.asString());
        System.out.println("Real(a) = " + a.re());
        System.out.println("Imaginary(b) = " + b.im());
        System.out.println("a + b = " + a.add(b).asString());
        System.out.println("a * b = " + a.multiply(b).asString());
        System.out.println("b * a = " + b.multiply(a).asString());

    }


}

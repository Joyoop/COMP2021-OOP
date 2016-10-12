package hk.edu.polyu.comp.comp2021.assignment2;

public class Complex {

    // Task 4: add the missing fields
    private final Rational re;   // the real part
    private final Rational im;   // the imaginary part

    public Complex(Rational real, Rational imag) {
        // Task 5: constructor
        re = real;
        im = imag;
    }

    public String asString() {
        // Task 5: asString method
        if (im.equals(0)) {
            return re.asString() + "";
        }

        if (re.equals(0)) {
            return im.asString() + "i";
        }

        if (im.less(0)) {
            return re + " - " + (im.negate()) + "i";
        }
        return re.asString() + " + " + im.asString() + "i";
    }

    public Complex add(Complex b) {
        // Task 5: add method
        Complex a = this;
        Rational real = a.re.add(b.re);
        Rational imag = a.im.add(b.im);
        return new Complex(real, imag);
    }

    public Complex multiply(Complex b) {
        // Task 5: multiply method
        Complex a = this;
        Rational real = a.re.multiply(b.re).minus(im.multiply(b.im));
        Rational imag = a.re.multiply(b.im).add(a.im.multiply(b.re));
        return new Complex(real, imag);
    }

    public Rational re() { return re; }
    public Rational im() { return im; }


    // sample client for testing
    public static void main(String[] args) {
        // Task 6: create Complex objects, add or multiply them, and
        //         print the results out to check they are correct
        Rational re1 = new Rational(5, 1);
        Rational im1 = new Rational(6,1);

        Rational re2 = new Rational(-3, 1);
        Rational im2 = new Rational(4,1);

        Complex a = new Complex(re1, im1);
        Complex b = new Complex(re2, im2);

        System.out.println("a = " + a.asString());
        System.out.println("b = " + b.asString());
        System.out.println("Real(a) = " + a.re().asString());
        System.out.println("Imaginary(b) = " + b.im().asString());
        System.out.println("a + b = " + a.add(b).asString());
        System.out.println("a * b = " + a.multiply(b).asString());
        System.out.println("b * a = " + b.multiply(a).asString());

    }


}

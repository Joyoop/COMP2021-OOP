package hk.edu.polyu.comp.comp2021.assignment2;

public class Rational {
    // Task 1: add the missing fields
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        // Assume 'denominator' is not 0;
        // Task 2: complete the constructor
        numerator = 0;
        denominator = 1;
    }

    public Rational add(Rational b){
        // Assume 'other' is not null
        // Task 2: complete the method
        Rational a = this;

        // special cases
        if (a.compareTo(zero) == 0) return b;
        if (b.compareTo(zero) == 0) return a;

        // Find gcd of numerators and denominators
        int f = gcd(a.num, b.num);
        int g = gcd(a.den, b.den);

        // add cross-product terms for numerator
        Rational s = new Rational((a.num / f) * (b.den / g) + (b.num / f) * (a.den / g),
                lcm(a.den, b.den));

        // multiply back in
        s.num *= f;
        return s;

    }

    public Rational multiply(Rational b){
        // Assume 'other' is not null
        // Task 2: complete the method
        Rational a = this;

        // reduce p1/q2 and p2/q1, then multiply, where a = p1/q1 and b = p2/q2
        Rational c = new Rational(a.numerator, b.denominator);
        Rational d = new Rational(b.numerator, a.denominator);
        return new Rational(c.numerator * d.numerator, c.denominator * d.denominator);

    }

    public String asString(){
        // Task 2: complete the method
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;

    }

    public static void main(String[] args){
        // Task 3: create Rational objects, add or multiply them, and
        //         print the results out to check they are correct

    }

}

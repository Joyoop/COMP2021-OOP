package hk.edu.polyu.comp.comp2021.assignment2;

public class Rational {
    // Task 1: add the missing fields
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        // Assume 'denominator' is not 0;
        // Task 2: complete the constructor
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational add(Rational b){
        // Assume 'other' is not null
        // Task 2: complete the method
        Rational a = this;

        int commonDenominator = this.denominator * b.denominator();
        int numerator1 = this.numerator * b.denominator();
        int numerator2 = b.numerator() * this.denominator;
        int sum = numerator1 + numerator2;

        return new Rational (sum, commonDenominator);

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

    // return -this
    public Rational negate() {
        return new Rational(-numerator, denominator);
    }

    // return this - that
    public Rational minus(Rational other) {
        return this.add(other.negate());
    }

    public int compareTo(Rational that) {
        long lhs = this.numerator * that.denominator;
        long rhs = this.denominator * that.numerator;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }

    // is this Rational object equal to other?
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Rational that = (Rational) other;
        return this.compareTo(that) == 0;
    }

    public String asString(){
        // Task 2: complete the method
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;

    }

    // return the numerator and denominator of (this)
    public int numerator()   { return numerator; }
    public int denominator() { return denominator; }


    public static void main(String[] args){
        // Task 3: create Rational objects, add or multiply them, and
        //         print the results out to check they are correct
        Rational x, y, z;

        // 1/2 + 1/3 = 5/6
        x = new Rational(1, 2);
        y = new Rational(1, 3);
        z = x.add(y);
        System.out.println(z.asString());

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.add(y);
        System.out.println(z.asString());

        // 1/200000000 + 1/300000000 = 1/120000000
        x = new Rational(1, 2);
        y = new Rational(1, 3);
        z = x.multiply(y);
        System.out.println(z.asString());

        // 1073741789/20 + 1073741789/30 = 1073741789/12
        x = new Rational(14, 20);
        y = new Rational(12, 30);
        z = x.multiply(y);
        System.out.println(z.asString());

        // 1/6 - -4/-8 = -1/3
        x = new Rational(1, 6);
        y = new Rational(-4, -8);
        z = x.minus(y);
        System.out.println(z.asString());

    }

}

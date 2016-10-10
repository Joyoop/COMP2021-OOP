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

        int commonDenominator = denominator * b.denominator();
        int numerator1 = numerator * b.denominator();
        int numerator2 = b.numerator() * denominator;
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
        x = new Rational(1, 200000000);
        y = new Rational(1, 300000000);
        z = x.add(y);
        System.out.println(z.asString());

        // 1073741789/20 + 1073741789/30 = 1073741789/12
        x = new Rational(1073741789, 20);
        y = new Rational(1073741789, 30);
        z = x.add(y);
        System.out.println(z.asString());

    }

}

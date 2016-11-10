/**
 * Created by Isaac on 11/10/16.
 */
public class Literal extends Expr{
    private double a;

    Literal(){
        this.a = 0;
    }

    Literal(double a){
        this.a = a;
    }

    @Override
    public double evaluate(Environment env){
        return a;
    }
    //Overload
    public double evaluate(){
        return a;
    }

    public String toString(){
        return a + "";
    }
}

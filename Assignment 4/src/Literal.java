/**
 * Created by Isaac on 11/10/16.
 */
public class Literal {
    private double a;

    Literal(){
        this.a = 0;
    }

    Literal(double a){
        this.a = a;
    }

    public Literal evaluate(){
        return this;
    }

    public String toString(){
        return a + "";
    }
}

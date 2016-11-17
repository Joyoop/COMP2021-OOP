/**
 * Created by Isaac on 11/10/16.
 */
public class BinaryExpr extends Expr{
    BinaryExpr(){
        this.a = null;
        this.b = null;
    }

    BinaryExpr(Expr a, Expr b, BinaryOp BinaryOp){
        this.a = a;
        this.b = b;
        this.BinaryOp = BinaryOp;
    }

    public String toString(){
        if(a.getClass().equals(BinaryExpr.class) && b.getClass().equals(BinaryExpr.class))
            return "(" + a + ") " + BinaryOp.getScale()+ " (" + b +")";
        else if(a.getClass().equals(BinaryExpr.class) && b.getClass().equals(Literal.class))
            return "(" + a + ") " + BinaryOp.getScale() + " " + b;
        else if(a.getClass().equals(Literal.class) && b.getClass().equals(BinaryExpr.class))
            return a + " " + BinaryOp.getScale() + " (" + b +")";
        else
            return  a + " " + BinaryOp.getScale() + " " + b;
    }

    @Override
    public double evaluate(Environment env){
        BinaryExpr copyExpr = new BinaryExpr(a, env.getVar(), BinaryOp);
        return copyExpr.evaluate();
    }

    @Override
    public double evaluate(){
            /*if(a.getClass().equals(Variable.class) || b.getClass().equals(Variable.class)){
                throw new RuntimeException();
            }*/
        return calculate(a.evaluate(), b.evaluate(), BinaryOp);
    }

    public double calculate(double x, double y, BinaryOp BinaryOp){
        if(BinaryOp.getScale() == "*"){
            return x * y;
        }else if(BinaryOp.getScale() == "+"){
            return x + y;
        }else if(BinaryOp.getScale() == "-"){
            return x - y;
        }else if(BinaryOp.getScale() == "/"){
            return x / y;
        }else{
            throw new IllegalArgumentException("invalid argument");
        }
    }

    private Expr a;
    private Expr b;
    private BinaryOp BinaryOp;
}

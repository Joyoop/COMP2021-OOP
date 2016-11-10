/**
 * Created by Isaac on 11/10/16.
 */
public class Expr {
    /*private BinaryOp BinaryOp;
    public Literal a;
    private Literal b;
    Expr(){

    }
    Expr(Literal a1, Literal a2, BinaryOp BinaryOp){
        this.a = a1;
        this.b = a2;
        this.BinaryOp = BinaryOp;
    }*/
    //@Override
    public double evaluate(Environment env){
        BinaryExpr copyExpr = new BinaryExpr(a,env.getVar(), BinaryOp);
        return copyExpr.evaluate();
    }

}

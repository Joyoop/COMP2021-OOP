/**
 * Created by Isaac on 11/10/16.
 */
public class BinaryExpr extends Literal{
    BinaryExpr(){
        this.a = null;
        this.b = null;
    }

    BinaryExpr(Literal a1, Literal a2, BinaryOp BinaryOp){
        this.a = a1;
        this.b = a2;
        this.BinaryOp = BinaryOp;
    }

    BinaryExpr(BinaryExpr b1, BinaryExpr b2, BinaryOp BinaryOp){
        this.a = b1;
        this.b = b2;
        this.BinaryOp = BinaryOp;
    }

    public String toString(){
        return a + " " + BinaryOp.getScale() + " " + b;
    }

    @Override
    public BinaryExpr evaluate(){
        return this;
    }

    private Literal a;
    private Literal b;
    private BinaryOp BinaryOp;
}

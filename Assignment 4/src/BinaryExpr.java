/**
 * Created by Isaac on 11/10/16.
 */
public class BinaryExpr {
    BinaryExpr(){
        this.a = null;
        this.b = null;

    }
    BinaryExpr(Literal a, Literal b, BinaryOp BinaryOp){
        this.a = a;
        this.b = b;
        this.BinaryOp = BinaryOp;
    }

    public Literal evaluate(){
        return a;
    }

    private Literal a;
    private Literal b;
    private enum BinaryOp{MULTIPLY,ADD,MINUS,DIVIDE};
    private BinaryOp BinaryOp;
}

/**
 * Created by Isaac on 11/10/16.
 */
public abstract class Expr {
    /*private BinaryOp BinaryOp;
    private Literal a;
    private Literal b;*/

    Expr(){

    }
    /*Expr(Literal a1, Literal a2, BinaryOp BinaryOp){
        this.a = a1;
        this.b = a2;
        this.BinaryOp = BinaryOp;
    }*/

    public double evaluate(Environment env){
        System.out.println("This is a mistake!");
        throw new RuntimeException();
    }

    public abstract double evaluate();


}

/*class RuntimeException extends java.lang.RuntimeException{
    private String msg = "Run time exception";
    //public RuntimeException() {this.msg = msg;}
    public RuntimeException(String msg) { this.msg = msg; }
    public RuntimeException(Throwable cause) { super(cause); }
    public RuntimeException(String msg, Throwable cause) {
        super(cause);
        this.msg = msg;
    }
}*/


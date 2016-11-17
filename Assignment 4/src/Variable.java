/**
 * Created by Isaac on 11/10/16.
 */
public class Variable extends Expr{
    private String name;
    Variable(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
    /* @Override
     * Parameter: none
     * This is where the RuntimeException is thrown
     */
    public double evaluate(){
        try {
            throw new RuntimeException ("Parameter Missing: Environment Variable 'env' ");
        }
        catch (RuntimeException exp) {
            System.out.printf(""+exp);
        }
        return Double.NaN;
    }
}

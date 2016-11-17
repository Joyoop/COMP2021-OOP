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

    public double evaluate(){
        try {
            throw new RuntimeException ("Environment env");
        }
        catch (RuntimeException exp) {
            System.out.printf("Missing parameter:");
        }
        return Double.NaN;
    }
}

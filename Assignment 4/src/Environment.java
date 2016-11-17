/**
 * Created by Isaac on 11/10/16.
 */
public class Environment {
    private String name;
    private double value;
    public void addVariable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public Expr getVar(){
        return new Literal(value);
    }
}

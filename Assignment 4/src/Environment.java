/**
 * Created by Isaac on 11/10/16.
 */
public class Environment {
    private String a;
    private double b;
    public void addVariable(String a, double b) {
        this.a = a;
        this.b = b;
    }

    public Literal getVar(){
        return new Literal(b);
    }
}

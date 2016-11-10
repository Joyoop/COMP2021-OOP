/**
 * Created by Isaac on 11/10/16.
 */
public class Variable extends Literal{
    private String name;
    Variable(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

/**
 * Created by Isaac on 11/10/16.
 */
public enum BinaryOp{

    /**
     * Divide
     */
    DIVIDE,
    /**
     * Multiply
     */
    MULTIPLY,
    /**
     * Add
     */
    ADD,
    /**
     * Minus
     */
    MINUS;



    /**
     * Return the scale of the level.
     *
     * @return Scale of the salary level.
     */
            public String getScale(){
                // Task 2: add your code here
                switch(this){
                    case DIVIDE:
                        return "/";
                    case MULTIPLY:
                        return "*";
                    case ADD:
                        return "+";
                    case MINUS:
                        return "-";
                    default: throw new IllegalArgumentException("invalid argument");
                }
                //return null;


    }
}

/**
 * Created by Isaac on 11/10/16.
 */
public enum BinaryOp{

    /**
     * Entry level
     */
    DIVIDE,
    /**
     * Junior level
     */
    MULTIPLY,
    /**
     * Senior Level
     */
    ADD,
    /**
     * Executive Level
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
                    //default: throw new InvalidArgumentException("invalid argument");
                }
                return null;


    }
}

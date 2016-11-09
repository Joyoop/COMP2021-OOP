/**
 * Created by Isaac on 11/10/16.
 */
enum BinaryOp{

    /**
     * Entry level
     */
    DIVIDE(1),
    /**
     * Junior level
     */
    MULTIPLY(2),
    /**
     * Senior Level
     */
    ADD(3),
    /**
     * Executive Level
     */
    MINUS(4);

    // Task 1: add your code here
    private double scale;
    BinaryOp(double scale) {
        this.scale = scale;
    }


    /**
     * Return the scale of the level.
     *
     * @return Scale of the salary level.
     */
            public double getScale(){
                // Task 2: add your code here
                switch(this){
                    case DIVIDE:
                        return this.scale;
                    case MULTIPLY:
                        return this.scale;
                    case ADD:
                        return this.scale;
                    case MINUS:
                        return this.scale;
                    //default: throw new InvalidArgumentException("invalid argument");
                }
                return this.scale;


    }
}

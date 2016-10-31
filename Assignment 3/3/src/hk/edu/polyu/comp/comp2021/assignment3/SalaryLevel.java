package hk.edu.polyu.comp.comp2021.assignment3;

// Task 1 and 2:
// add necessary code to enum SalaryLevel and its method getScale, so that
// ENTRY.getScale() returns 1, JUNIOR.getScale() returns 1.3, and so on.

/**
 * Levels of salary.
 */
enum SalaryLevel {

    /**
     * Entry level
     */
    ENTRY(1),
    /**
     * Junior level
     */
    JUNIOR(1.3),
    /**
     * Senior Level
     */
    SENIOR(1.6),
    /**
     * Executive Level
     */
    EXECUTIVE(2);

    // Task 1: add your code here
    private double scale;
    private SalaryLevel(double scale) {
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
            case ENTRY:
                return this.scale;
            case JUNIOR:
                return this.scale;
            case SENIOR:
                return this.scale;
            case EXECUTIVE:
                return this.scale;
           // default: throw new InvalidArgumentException("invalid argument");
        }
        throw new IllegalArgumentException();
        
        
    }

}
/**
 * Created by LX.Conan on 2016/10/23.
 */
public class Runner {

    // do not modify
    Runner() {
        name = "None";
        speed = -1;
    }

    // define your own constructor here
    Runner(String name, float speed, float location) {
        this.name = name;
        this.speed = speed;
        this.location = location;
    }

    // -------------------------------------------------
    // setter and getter method
    // -------------------------------------------------
    public void setName(String arg) {
        this.name = arg;
    }

    public void setSpeed(float arg) {
        // your code here
        this.speed = arg;
    }

    public void setLocation(float location) {
        // your code here
        this.location = location;
    }

    public String getName() {
        // your code here
        return name;
    }

    public float getSpeed() {
        // your code here
        return speed;
    }

    public float getLocation() {
        // your code here
        return location;
    }

    // a base run method
    public void run() {
        // your code here
        // note: loc = loc + speed
        location += speed;
    }


    public void printCurrentState() {
        System.out.println("runner: name - " + name + " loc - " + this.location + " speed - " + this.speed);
    }

    // choosing one of three modifiers
    private String name;
    private float speed;
    private float location;
}

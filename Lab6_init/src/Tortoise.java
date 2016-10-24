/**
 * Created by LX.Conan on 2016/10/23.
 */

class Tortoise extends Runner {
    // do not modify
    Tortoise() {
        super.location = 0;
        super.speed = 0;
        super.name = "None";
    }

    // define your own constructor
    // note: using keyword *super.*
    Tortoise(String args1,float args2, float args3) {
        // your code here
        this.location = args3;
        this.name = args1;
        this.speed = args3;

    }

    // override run
    // note: if something is smaller than napChance (something < napChance),
    // the rabbit will forward with its speed (loc = loc + speed)
    public void run() {
        location += speed;
    }

    public void printCurrentState() {
        System.out.println("tortoise: name - " + super.name + " loc - " + super.location + " speed - " + super.speed);
    }
}

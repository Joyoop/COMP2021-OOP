/**
 * Created by LX.Conan on 2016/10/23.
 */

class Tortoise extends Runner {
    // do not modify
    Tortoise() {
        super.setLocation(0);
        super.setSpeed(0);
        super.setName("None");
    }

    // define your own constructor
    // note: using keyword *super.*
    Tortoise(String args1,float args2, float args3) {
        // your code here
        this.setLocation(args3);
        this.setName(args1);
        this.setSpeed(args3);

    }

    // override run
    // note: if something is smaller than napChance (something < napChance),
    // the rabbit will forward with its speed (loc = loc + speed)
    public void run() {
        float loc = this.getLocation() + this.getSpeed();
        this.setLocation(loc += this.getSpeed());
    }

    public void printCurrentState() {
        System.out.println("tortoise: name - " + super.getName() + " loc - " + super.getLocation() + " speed - " + super.getSpeed());
    }
}

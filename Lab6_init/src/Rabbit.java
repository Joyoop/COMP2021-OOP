/**
 * Created by LX.Conan on 2016/10/23.
 */

import java.lang.*;

class Rabbit extends Runner {
    // default constructor, do not modify
    Rabbit() {
        super.setName("None");
        super.setSpeed(0);
        super.setLocation(0);
        napChance = 0;
    }

    // please define your own constructor with proper variables
    // using keyword *super.*
    Rabbit(String name, float speed, float location, float napChance) {
        this.setLocation(location);
        this.setName(name);
        this.setSpeed(speed);
        this.napChance = napChance;
    }

    // rabbit will nap if it feels tired. The napChance is the threshold for napping.
    // if something (maybe number) is beyond napChance, the rabbit will nap a step
    void setNapChance(float args) {
        // your code here
        this.napChance = args;
    }

    float getNapChance() {
        // your code here
        return napChance;
    }

    // override run
    // note: if something is smaller than napChance (something < napChance),
    // the rabbit will forward with its speed (loc = loc + speed)
    public void run() {
        // your code here
        float temp = (float) Math.random();
        if(temp <= napChance){
            float loc = this.getLocation() + this.getSpeed();
            this.setLocation(loc += this.getSpeed());
        }else{
            //location = location;
        }
    }

    public int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    // a default print state
    public void printCurrentState() {
        System.out.println("rabbit: name - " + super.getName() + " loc - " + super.getLocation() + " speed - " + super.getSpeed());
    }

    private float napChance;
}
/**
 * Created by LX.Conan on 2016/10/23.
 */

import java.lang.*;

class Rabbit extends Runner {
    // default constructor, do not modify
    Rabbit() {
        super.name = "None";
        super.speed = 0;
        super.location = 0;
        napChance = 0;
    }

    // please define your own constructor with proper variables
    // using keyword *super.*
    Rabbit(String name, float speed, float location, float napChance) {
        this.location = location;
        this.name = name;
        this.speed = speed;
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
            location += speed;
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
        System.out.println("rabbit: name - " + super.name + " loc - " + super.location + " speed - " + super.speed);
    }

    private float napChance;
}
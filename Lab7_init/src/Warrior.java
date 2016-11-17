/**
 * Created by Isaac on 11/1/16.
 */
public class Warrior extends Hero{
    public Warrior(String name){
        super(name);
        System.out.println("warrior's constructor");
    }
    public void doAction(Hero other){
        int damage = Math.min(getLevel() * 5, other.getHealth());
        other.setHealth(other.getHealth() - damage);
        System.out.println(getName() + " attacks " + other.getName() + ". Does " + damage + " damage.");
    }
    public void print(){
        System.out.println("Warrior's print");
    }
    public void levelUp(){
        super.levelUp();
        System.out.println(getName() + " is now a level " + getLevel() + " warrior.");

    }
}

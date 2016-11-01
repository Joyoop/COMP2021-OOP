/**
 * Created by Isaac on 11/1/16.
 */
public class Warrior extends Hero{
    public Warrior(String name){
        super(name);
    }
    public void doAction(Hero other){
        int damage = Math.min(getLevel() * 5, other.getHealth());
        other.setHealth(other.getHealth() - damage);
        System.out.println(getName() + " attacks " + other.getName() + ". Does " + damage + " damage.");
    }
    public void levelUp(){
        super.levelUp();
        System.out.println(getName() + " is now a level " + getLevel() + " warrior.");

    }
}

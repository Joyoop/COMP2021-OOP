/**
 * Created by Isaac on 11/1/16.
 */
public abstract class Hero {
    private String name;
    private int level;
    private int health;
    public Hero(String s){
        name = s;
        level = 1;
        health = 100;
        System.out.println("hero's constructor");
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
        if(health == 0){
            System.out.println(name + " is dead.");
        }
    }

    public abstract void doAction(Hero other);
    public void print(){
        System.out.println("hero's print no para");
    }
    public void print(int i){
        System.out.println("hero's print with para");
    }
    public void levelUp(){
        level++;
        setHealth(100);
    }
}

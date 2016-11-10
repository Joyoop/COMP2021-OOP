/**
 * Created by LX.Conan on 2016/10/30.
 */

public class TestMain {
    // in this TestMain file, your should check all your code implementation
    public static void main(String[] args) {
        /*
        Rectangle r1 = new Rectangle(1,1,2,2);
        Circle c1 = new Circle(3);
        System.out.println(r1.getParam(0));
        System.out.println(r1.getParam(1));
        System.out.println(r1.getParam(2));
        System.out.println(r1.getParam(3));
        System.out.println(c1.getParam());
        r1.printArea();
        r1.printShape();
        c1.printArea();
        c1.printShape();
        Shape r2 = r1.clone();
        Shape r3 = (Rectangle) r1.copy();
        Shape c2 = (Circle) c1.clone();
        Shape c3 = (Circle) c1.copy();

        System.out.println(r2.getParam(0));
        System.out.println(c2.getParam(0));

        r2.setParam(0,"2");
        System.out.println(r1.getParam(0));
        System.out.println(r2.getParam(0));

        r3.setParam(0,"3");
        System.out.println(r1.getParam(0));
        System.out.println(r3.getParam(0));

        Rectangle r4 = new Rectangle(1,1,1,1);
        r4.setParam(1,0.5);
        */
        Hero hero;
        Warrior warrior;
        Healer healer;

        //task1
        //warrior = new Warrior("Thor");
        //warrior.levelUp();

        //task2
        //hero = new Hero("Althea");
        //hero.levelUp();

        //warrior = new Warrior("Thor");
        //healer = new Healer("Althea");
        //warrior.doAction(healer);

        //warrior = new Healer("Diana");
        //warrior.levelUp();
        warrior = new Warrior("Thor");
        hero = new Healer("Althea");
        warrior.doAction(hero);

        hero.doAction(hero);

        //Warrior = new Hero("Thor");
        //warrior.doAction(hero);
    }
}

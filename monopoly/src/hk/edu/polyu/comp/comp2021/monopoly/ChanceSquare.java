package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Random;
/**
 * Created by Isaac on 11/27/16.
 */
public class ChanceSquare extends Square{
    public ChanceSquare(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
        Random temp = new Random();
        int loseAmount = temp.nextInt(30) * 10;
        int gainAmount = temp.nextInt(20) * 10;

        if(Math.random() < 0.5) {
            Util.print(player, player.getName() + " is at Chance square... Gaining "+gainAmount+" money");
            player.getMoney().addMoney(gainAmount);
        }else{
            Util.print(player, player.getName() + " is at Chance square... losing "+loseAmount+" money");
            player.getMoney().substractMoney(loseAmount);
        }
    }
}

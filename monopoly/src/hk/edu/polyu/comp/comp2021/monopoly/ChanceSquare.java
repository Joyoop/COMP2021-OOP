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
    public void squareMove(Player player, Board board) {
        Random temp = new Random();
        final int LOSRAMOUNTNO = 30;
        final int GAINAMOUNTNO = 20;
        final double RANDOMRANT = 0.5;
        int loseAmount = temp.nextInt(LOSRAMOUNTNO) * 10;
        int gainAmount = temp.nextInt(GAINAMOUNTNO) * 10;

        if(Math.random() < RANDOMRANT) {
            Util.print(player, player.getName() + " is at Chance square... Gaining "+gainAmount+" money");
            player.getMoney().addMoney(gainAmount);
        }else{
            Util.print(player, player.getName() + " is at Chance square... losing "+loseAmount+" money");
            player.getMoney().substractMoney(loseAmount);
        }
    }
}

package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created by Isaac on 11/27/16.
 */
public class TaxSquare extends Square{
    public TaxSquare(String name) {
        super(name);
    }

    @Override
    public void squareMove(Player player, Board board) {
        Util.print(player, player.getName() + " is at Tax square... Being taxed for 10% of his/her money");
        player.getMoney().taxMoney();
    }
}

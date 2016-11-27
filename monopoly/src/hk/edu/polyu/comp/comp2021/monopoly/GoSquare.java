package hk.edu.polyu.comp.comp2021.monopoly;
/**
 * Created by Isaac on 11/27/16.
 */
public class GoSquare extends Square {
	public GoSquare(String name) {
		super(name);
	}
	
	@Override
	public void doAction(Player player, Board board) {
		Util.print(player, player.getName() + " is at Go... Giving 1500 money");
		player.getMoney().addMoney(1500);
	}
}

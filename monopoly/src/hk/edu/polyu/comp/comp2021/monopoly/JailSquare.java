package hk.edu.polyu.comp.comp2021.monopoly;/**
 * Created by Isaac on 11/27/16.
 */
public class JailSquare extends Square {
	public JailSquare(String name) {
		super(name);
	}
	
	@Override
	public void doAction(Player player, Board board) {
		Util.print(player, player.getName() + " has been Jail and lost 500 money");
		player.getMoney().substractMoney(500);
	}
}

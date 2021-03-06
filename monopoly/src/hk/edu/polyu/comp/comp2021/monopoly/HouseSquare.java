package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Random;
/**
 * Created by Isaac on 11/27/16.
 */
public class HouseSquare extends Square {
	private int price;
	private int owner = -1;
	private int rent;

	public HouseSquare(String name, int price, int rent) {
		super(name);
		this.price = price;
		this.rent = rent;
	}



	@Override
	public void squareMove(Player player, Board board) {
		//if player.state = 0
		boolean input2;
		if(owner < 0){
			if(player.getAI()){
				Random rand = new Random();
				input2 = rand.nextBoolean();
			}else {
				Util.print(player, player.getName() + ", do you want to buy " + getName() + "? (1 for yes, 2 for no)");
				input2 = PauseTest.userInput();
			}
			if(input2){
				Util.print(player, player.getName() + " buy " + getName() + " for " + price);
				owner = player.getID();
				player.getMoney().substractMoney(price);
			}else{
				Util.print(player, player.getName() + " don't want to buy " + getName());
			}
		}else{
			if(owner != player.getID()){
				Util.print(player, player.getName() + " lost " + rent + " money to " + board.getPlayer(owner).getName());
				player.getMoney().substractMoney(rent);
				board.getPlayer(owner).getMoney().addMoney(rent);
			}
		}
	}
}

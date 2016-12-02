package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Random;

/**
 * Created by Isaac on 11/27/16.
 */
public class JailSquare extends Square {
	public JailSquare(String name) {
		super(name);
	}

	public int getOutJail(Player player,Board board, int face){
		Util.print(player, player.getName() + " has been Jail.");
		if(player.getTossCount() == 0){
			player.setTossCount(player.getTossCount() + 1);
			player.setFirstToss(face);
			boolean input;
			if(player.getAI()){
				Random rand = new Random();
				input = rand.nextBoolean();
			}else {
				Util.print(player, player.getName() + ", do you want to pay the fine or stay in jail? (1 for yes, 2 for no)");
				input = PauseTest.userInput();
			}
			if(input){
				//pay the fine
				player.setFirstToss(0);
				player.setTossCount(0);
				return 1;
			}else{
				return -1;
			}
		}else if(player.getTossCount() == 1){
			player.setTossCount(player.getTossCount() + 1);
			player.setSecondToss(face);
			if(player.getFirstToss() == player.getSecondToss()){
				//bingo! I win!
				player.setFirstToss(0);
				player.setSecondToss(0);
				player.setTossCount(0);
				return 0;
			}else{
				boolean input;
				if(player.getAI()){
					Random rand = new Random();
					input = rand.nextBoolean();
				}else {
					Util.print(player, player.getName() + ", do you want to pay the fine or stay in jail the second time? (1 for yes, 2 for no)");
					input = PauseTest.userInput();
				}
				if(input){
					//pay the fine
					player.setFirstToss(0);
					player.setSecondToss(0);
					player.setTossCount(0);
					return 1;
				}else{
					//not paying the fine
					return -1;
				}
			}
		}else if(player.getTossCount() == 2){
			player.setThirdToss(face);
			if(player.getThridToss() == player.getSecondToss()|| player.getThridToss() == player.getFirstToss()){
				player.setFirstToss(0);
				player.setSecondToss(0);
				player.setThirdToss(0);
				player.setTossCount(0);
				return 0;
			}else{
				player.setFirstToss(0);
				player.setSecondToss(0);
				player.setThirdToss(0);
				player.setTossCount(0);
				return 1;
			}
		}
		return -1;
	}


	@Override
	public void squareMove(Player player, Board board) {
		Util.print(player, player.getName() + " has been Jail and lost 50 money");
		player.getMoney().substractMoney(50);
	}

}

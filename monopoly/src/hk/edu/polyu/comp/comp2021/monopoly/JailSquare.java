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
		if(player.tossCount == 0){
			player.tossCount ++;
			player.firstToss = face;
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
				player.firstToss = 0;
				player.tossCount = 0;
				return 1;
			}else{
				return -1;
			}
		}else if(player.tossCount == 1){
			player.tossCount++;
			player.secondToss = face;
			if(player.firstToss == player.secondToss){
				//bingo! I win!
				player.firstToss = 0;
				player.secondToss = 0;
				player.tossCount = 0;
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
					player.firstToss = 0;
					player.secondToss = 0;
					player.tossCount = 0;
					return 1;
				}else{
					//not paying the fine
					return -1;
				}
			}
		}else if(player.tossCount == 2){
			player.thirdToss = face;
			if(player.thirdToss == player.secondToss|| player.thirdToss == player.firstToss){
				player.firstToss = 0;
				player.secondToss = 0;
				player.thirdToss = 0;
				player.tossCount = 0;
				return 0;
			}else{
				player.firstToss = 0;
				player.secondToss = 0;
				player.thirdToss = 0;
				player.tossCount = 0;
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

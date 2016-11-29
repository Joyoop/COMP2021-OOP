package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Scanner;

public class Monopoly {
	Die die = new Die();
	Board board;
	
	public Monopoly(int totalPlayer, int[] aiList) {
		board = new Board(totalPlayer, aiList);
	}
	
	public static void main(String[] args) {

		int firstInput = 0;
		while(firstInput != 3) {
			System.out.println("Enter 1 if You want to see the board map");
			System.out.println("Enter 2 if You want to read the instructions");
			System.out.println("Enter 3 if You want to start the game: ");
			firstInput = PauseTest.initInput();

			if(firstInput == 1){
				printBoard();
			}else if(firstInput == 2){
				printInstruction();
			}
		}

		int totalPlayer = 0;

		while (totalPlayer < 2 || totalPlayer > 8){
			System.out.println("Enter the Total Player You want (between 2 and 6): ");
			totalPlayer = PauseTest.initInput();
		}

		System.out.println("Enter the No. of AI player you want : ");
		int	aiInit = PauseTest.initInput();
		int [] aiPlayer = PauseTest.aiInput(aiInit);

		Monopoly game = new Monopoly(totalPlayer, aiPlayer);
		game.startGame();
	}

	public static void printBoard(){
		System.out.println("this is the board");
	}

	public static void printInstruction(){
		System.out.println("this is the instruction");
	}
	
	public void startGame() {
		System.out.println("Game start!");
		System.out.println("========");
		while (!isGameEnd() && !board.hasWinner()){
			if(!board.getCurrentPlayer().isBrokeOut()){
				int input = 0;

				if(!board.getCurrentPlayer().getAI()) {
					while (input == 2 || input < 1 || input > 4) {
						System.out.println("1 for continue, 2 for report, 3 for auto and 4 for retire");
						//We could trigger the start point here
						input = PauseTest.userInput2();

						if (input == 1) {
							break;
						} else if (input == 2) {
							System.out.println(board.getPlayers());
						} else if (input == 3) {
							board.getCurrentPlayer().setAI(true);
						} else if (input == 4) {
							board.getCurrentPlayer().setBrokeOut(true);
							System.out.println(board.getCurrentPlayer()+" has quit the game!");
						}
					}
				}
				if(!board.getCurrentPlayer().isBrokeOut()) {
					int face = board.getCurrentPlayer().tossDie(die);
					board.movePlayer(board.getCurrentPlayer(), face);
				}
			}
			board.nextTurn();
		}
		System.out.println("========");
		if(board.hasWinner()){
			System.out.println(board.getWinner().getName() + " is won by don't brokeout!");


		}else{
			System.out.println(board.getMaxMoneyPlayer().getName() + " is won by have most money!");
		}
		PauseTest.closeScanner();
		System.out.println("Game over!");
	}
	
	public boolean isGameEnd() {
		for(Player player:board.getPlayers()){
			if(player.getTotalWalk() >= 100) {
				return true;
			}
		}
		return false;
	}
}

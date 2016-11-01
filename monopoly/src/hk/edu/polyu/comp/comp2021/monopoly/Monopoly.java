package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Scanner;

public class Monopoly {
	Die die = new Die();
	Board board;
	
	public Monopoly(int totalPlayer, int[] aiList) {
		board = new Board(totalPlayer, aiList);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
			System.out.println("Enter the Total Player You want: ");
			totalPlayer = PauseTest.initInput();
			//scanner.close();
		}


		System.out.println("Enter the No. of AI player you want : ");
		int[] aiPlayer = PauseTest.aiInput();
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
				//PauseTest.triggerDie();

				int face = board.getCurrentPlayer().tossDie(die);
				board.movePlayer(board.getCurrentPlayer(), face);
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
			if(player.getTotalWalk() < 100){ return false; }
		}
		return true;
	}
}

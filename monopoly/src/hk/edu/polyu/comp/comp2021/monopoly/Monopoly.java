package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Scanner;

public class Monopoly {
	Die die = new Die();
	Board board;
	
	public Monopoly(int totalPlayer) {
		board = new Board(totalPlayer);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstInput = 0;
		while(firstInput != 3) {
			System.out.println("Enter 1 if You want to see the board map");
			System.out.println("Enter 2 if You want to read the instructions");
			System.out.print("Enter 3 if You want to start the game: ");
			firstInput = scanner.nextInt();
			if(firstInput == 1){
				printBoard();
			}else if(firstInput == 2){
				printInstruction();
			}else if(firstInput == 3){
				break;
			}
		}

		int totalPlayer = 0;

		while (totalPlayer < 2 || totalPlayer > 8){
			System.out.print("Enter the Total Player You want to : ");
			totalPlayer = scanner.nextInt();
			scanner.close();
		}

		Monopoly game = new Monopoly(totalPlayer);
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
		System.out.println("Game over!");
	}
	
	public boolean isGameEnd() {
		for(Player player:board.getPlayers()){
			if(player.getTotalWalk() < 20){ return false; }
		}
		return true;
	}
}

package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Random;
/**
 * Created by Isaac on 11/27/16.
 */
public class Board {
	int currentTurn = 0;
	int totalPlayer = 0;
	Player[] players;
	Square[] squares = new Square[20];
	
	public Board(int totalPlayer, int[] AI) {
		players = new Player[totalPlayer];
		this.totalPlayer = totalPlayer;
		for(int i = 0;i < players.length;i++){
			players[i] = new Player(i, "Player " + (i + 1));
		}
		System.out.println(AI);
		for(int j = 0; j < AI.length ; j++){
			players[AI[j]-1].setAI(true);
		}

		//first six squares
		squares[0] = new GoSquare("GO");
		squares[1] = new HouseSquare("CENTRAL",800,90);
		squares[2] = new HouseSquare("Wan Chai",700,65);
		squares[3] = new TaxSquare("Tax Square");
		squares[4] = new HouseSquare("Stanley",600,60);
		squares[5] = new JailSquare("Jail");

		//second six squares
		squares[6] = new HouseSquare("Shek O",400,10);
		squares[7] = new HouseSquare("Mong Kok",500,40);
		squares[8] = new ChanceSquare("Chance 1");
		squares[9] = new HouseSquare("Tsing Yi",400,15);
		squares[10] = new FreeSquare("Free Parking");
		squares[11] = new HouseSquare("Shatin",700,75);

		//last eight squares
		squares[12] = new ChanceSquare("Chance 2");
		squares[13] = new HouseSquare("Tuen Mun",400,20);
		squares[14] = new HouseSquare("Tai Po",500,25);
		squares[15] = new GoToJailSquare("Go To Jail");
		squares[16] = new HouseSquare("Sai Kung",400,10);
		squares[17] = new HouseSquare("Yuen Long",400,25);
		squares[18] = new ChanceSquare("Chance 3");
		squares[19] = new HouseSquare("Tai O",600,25);

	}
	
	public void movePlayer(Player player, int face) {
		movePlayer(player, face, true);
	}
	
	public void movePlayer(Player player, int face, boolean count) {
		//see if the current player is broke out
		/*
		if(player.isBrokeOut()){
			//return squares[player.getCurrentPosition()];
		}*/
		int newPosition;
		if(player.getCurrentPosition() == 5){
			if(((JailSquare)squares[5]).getOutJail(player, this, face) == -1) {
				newPosition = normalizePosition(player.getCurrentPosition());

                player.setPosition(newPosition);

                Util.print(player, player.getName() + " stays in " + squares[player.getCurrentPosition()].getName());

                //squares[newPosition].doAction(player, this);

			}else if(((JailSquare)squares[5]).getOutJail(player, this, face) == 1){

                squares[player.getCurrentPosition()].squareMove(player, this);

				newPosition = normalizePosition(player.getCurrentPosition() + face);

                player.setPosition(newPosition);

                Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());

                squares[newPosition].squareMove(player, this);

			}else if(((JailSquare)squares[5]).getOutJail(player, this, face) == 0){
                newPosition = normalizePosition(player.getCurrentPosition() + face);

                player.setPosition(newPosition);

                Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());

                squares[newPosition].squareMove(player, this);
            }
		}
		else{
			newPosition = normalizePosition(player.getCurrentPosition() + face);

            player.setPosition(newPosition);

            Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
            if(newPosition != 5) {
                squares[newPosition].squareMove(player, this);
            }
		}


		if(player.getMoney().isBrokeOut()){
			Util.print(player, player.getName() + " has been broke out!");
			System.out.println(player.getID());
			player.setBrokeOut(true);
		}else{
			if(count){
				player.nextTurn();
			}
		}
	}
	
	public boolean hasWinner() {
		int ingame = 0;
		for(Player player:players){
			if(!player.isBrokeOut()){
				ingame++;
			}
		}
		return ingame <= 1;
	}
	public boolean hasDraw(Player player){
		if(player.totalWalk == 100){
			return true;
		}
		return false;
	}
	public Player getWinner() {
		if(!hasWinner()){ return null; }
		for(Player player:players){
			if(!player.isBrokeOut()){ return player; }
		}
		return null;
	}
	
	public Player getMaxMoneyPlayer() {
		Player maxplayer = null;
		for(Player player:players){
			if(maxplayer == null || maxplayer.getMoney().getMoney() < player.getMoney().getMoney()){
				maxplayer = player;
			}
		}
		return maxplayer;
	}
	
	public int normalizePosition(int position) {
		return position % squares.length;
	}
	
	public Player getCurrentPlayer() {
		return players[currentTurn];
	}
	
	public Player[] getPlayers() {
		return players;
	}
	
	public void nextTurn() {
		if(++currentTurn >= players.length){
			currentTurn = 0;
		}
	}
	
	public Player getPlayer(int id) {
		return players[id];
	}
	
	public int getTotalSquare() {
		return squares.length;
	}
}

package hk.edu.polyu.comp.comp2021.monopoly;
/**
 * Created by Isaac on 11/27/16.
 */
public class Board {
	private int currentTurn = 0;
	private int totalPlayer = 0;
	private Player[] players;
	private static final int SQUARE_NO = 20;
	private Square[] squares = new Square[SQUARE_NO];
	
	public Board(int totalPlayer, int[] AI) {
		players = new Player[totalPlayer];
		this.totalPlayer = totalPlayer;
		for(int i = 0;i < players.length;i++){
			players[i] = new Player(i, "Player " + (i + 1));
		}
		//System.out.println(AI);
		if(AI[0] != 0) {
			for (int j = 0; j < AI.length; j++) {
				players[AI[j] - 1].setAI(true);
			}
		}

		//first six squares
		String [] squaresName = {"Go", "Central","Wan Chai", "Tax Square", "Stanley", "Shek O", "Mong Kok", "Chance 1","Tsing Yi","Free Parking","Shatin","Chance 2","Tuen Mun","Tai Po","Go To Jail","Sai Kung","Yuen Long","Chance 3","Tai O"};
		final int CENTRALPRICE = 800;
		final int CENTRALRENT = 70;
		final int WANCHAIPRICE = 700;
		final int WANCHAIRENT = 65;
		final int STANLEYPRICE = 600;
		final int STANLEYRENT = 60;
		final int SHEKOPRICE = 400;
		final int SHEKORENT = 10;
		final int MONGKOKPRICE = 500;
		final int MONGKOKRENT = 40;
		final int TSINGYIPRICE =400;
		final int TSINGYIRENT = 15;
		final int SHATINPRICE =700;
		final int SHATINRENT = 75;
		final int TUENMUNPRICE =400;
		final int TUENMUNRENT = 20;
		final int TAIPOPRICE =500;
		final int TAIPORENT = 25;
		final int SAIKUNGPRICE =400;
		final int SAIKUNGRENT = 10;
		final int YUENLONGPRICE =400;
		final int YUENLONGRENT = 25;
		final int TAIOPRICE =600;
		final int TAIORENT = 25;
		int indexOfArray = 9;
		squares[0] = new GoSquare("GO");
		squares[1] = new HouseSquare("CENTRAL",CENTRALPRICE,CENTRALRENT);
		squares[2] = new HouseSquare("Wan Chai",WANCHAIPRICE,WANCHAIRENT);
		squares[3] = new TaxSquare("Tax Square");
		squares[4] = new HouseSquare("Stanley",STANLEYPRICE,STANLEYRENT);
		squares[5] = new JailSquare("Jail");

		//second six squares
		squares[6] = new HouseSquare("Shek O",SHEKOPRICE,SHEKORENT);
		squares[7] = new HouseSquare("Mong Kok",MONGKOKPRICE,MONGKOKRENT);
		squares[8] = new ChanceSquare("Chance 1");
		squares[9] = new HouseSquare("Tsing Yi",TSINGYIPRICE,TSINGYIRENT);
		squares[10] = new FreeSquare("Free Parking");
		squares[indexOfArray + 2] = new HouseSquare("Shatin",SHATINPRICE,SHATINRENT);

		//last eight squares
		squares[indexOfArray + 3] = new ChanceSquare("Chance 2");
		squares[indexOfArray + 4] = new HouseSquare("Tuen Mun",TUENMUNPRICE,TUENMUNRENT);
		squares[indexOfArray + 5] = new HouseSquare("Tai Po",TAIPOPRICE,TAIPORENT);
		squares[indexOfArray + 6] = new GoToJailSquare("Go To Jail");
		squares[indexOfArray + 7] = new HouseSquare("Sai Kung",SAIKUNGPRICE,SAIKUNGRENT);
		squares[indexOfArray + 8] = new HouseSquare("Yuen Long",YUENLONGPRICE,YUENLONGRENT);
		squares[indexOfArray + 9] = new ChanceSquare("Chance 3");
		squares[indexOfArray + 10] = new HouseSquare("Tai O",TAIOPRICE,TAIORENT);

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
			player.setBrokeOut(true, this);
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
	/*
	public boolean hasDraw(Player player){
		if(player.totalWalk == 100){
			return true;
		}
		return false;
	}*/
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
	
	public void getReport(){
		for (int i = 0; i < squares.length; i++){
			int tempSquareNo = i + 1;
			System.out.println("Square "+ tempSquareNo + " is "+ squares[i].getName());
		}
		for (int j = 0; j < players.length; j++){
			int tempPlayerNo = j + 1;
			int tempPlayerSquareNo = players[j].getCurrentPosition() + 1;
			System.out.println("Player " + tempPlayerNo +" is at " + tempPlayerSquareNo);
		}
	}



	public void nextTurn() {
		if(++currentTurn >= players.length){
			currentTurn = 0;
		}
	}

	public Player getPlayer(int id) {
		return players[id];
	}
	public Square getSquares(int number) {
		return squares[number];
	}
	
	public int getTotalSquare() {
		return squares.length;
	}


}

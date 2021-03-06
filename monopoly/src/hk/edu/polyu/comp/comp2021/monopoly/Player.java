package hk.edu.polyu.comp.comp2021.monopoly;

public class Player {
	private int totalWalk = 0;
	private int position = 0;
	private int id;
	private String name;
	private boolean brokeout = false;
	private boolean isAI = false;
	private final int STARTMONEY = 1500;
	private Money money = new Money(STARTMONEY);
	private int firstToss;
	private int secondToss;
	private int thirdToss;
	private int tossCount;

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getTotalWalk() {
		return totalWalk;
	}

	public int tossDie(Die die) {
		int face = die.getFace();
		Util.print(this, getName() + " toss a die... Face is " + face);
		return face;
	}
	
	public int getCurrentPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void nextTurn() {
		totalWalk++;
	}
	
	public String getName() {
		return name;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public int getID() {
		return id;
	}
	public boolean getAI(){
		return isAI;
	}

	public void setAI(boolean x){
		this.isAI = x;
	}
	public void setBrokeOut(boolean brokeout, Board board) {
		int playerID = this.getID();
		this.setUnown(playerID, board);
		this.brokeout = brokeout;
	}
	
	public boolean isBrokeOut() {
		return brokeout;
	}
	public void setUnown(int playerID, Board board){
		for(int i = 0; i < 20; i++){
			if(board.getSquares(i) instanceof HouseSquare){
				if(board.getSquares(i).getOwner() == playerID) {board.getSquares(i).setOwner(-1); }
			}
		}
	}


	public int getFirstToss(){
		return this.firstToss;
	}
	public int getSecondToss(){
		return this.secondToss;
	}
	public int getThridToss(){
		return this.thirdToss;
	}
	public int getTossCount(){
		return this.tossCount;
	}
	public void setFirstToss(int first){
		this.firstToss = first;
	}
	public void setSecondToss(int second){
		this.secondToss = second;
	}
	public void setThirdToss(int third){
		this.thirdToss = third;
	}
	public void setTossCount(int count){
		this.tossCount = count;
	}

}

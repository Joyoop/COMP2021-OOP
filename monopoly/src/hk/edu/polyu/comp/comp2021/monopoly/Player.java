package hk.edu.polyu.comp.comp2021.monopoly;

public class Player {
	int totalWalk = 0;
	int position = 0;
	int id;
	String name;
	private boolean brokeout = false;
	boolean isAI = false;
	Money money = new Money(1500);

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
	public void setBrokeOut(boolean brokeout) {
		this.brokeout = brokeout;
	}
	
	public boolean isBrokeOut() {
		return brokeout;
	}
}

package hk.edu.polyu.comp.comp2021.monopoly;

public abstract class Square {
	private String name;
	private int owner = -1;
	
	public Square(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getOwner(){return owner;}

	public void setOwner(int owner){this.owner = owner;}
	
	public abstract void squareMove(Player player, Board board);
}

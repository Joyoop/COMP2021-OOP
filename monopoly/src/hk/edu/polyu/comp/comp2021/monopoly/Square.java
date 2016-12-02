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
	
	public abstract void squareMove(Player player, Board board);
}

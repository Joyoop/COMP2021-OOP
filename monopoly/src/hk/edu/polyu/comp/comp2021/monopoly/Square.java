package hk.edu.polyu.comp.comp2021.monopoly;

public abstract class Square {
	String name;
	int owner = -1;
	
	public Square(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void doAction(Player player, Board board);
}

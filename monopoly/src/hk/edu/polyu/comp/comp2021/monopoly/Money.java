package hk.edu.polyu.comp.comp2021.monopoly;

public class Money {
	int money;
	
	public Money() {
		this(0);
	}
	
	public Money(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int amount) {
		money += amount;
	}

	public void taxMoney(){
		money *= 0.9;
	}
	
	public void substractMoney(int amount) {
		money -= amount;
	}
	
	public boolean isBrokeOut() {
		return money < 0;
	}
}

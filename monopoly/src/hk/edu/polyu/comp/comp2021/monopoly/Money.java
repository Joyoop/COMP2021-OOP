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
		if(money%10 == 0) {
			money *= 0.9;
		}else{
			int x = money%10;
			money -= money%10;
			money *= 0.9;
			money += x;
		}
	}
	
	public void substractMoney(int amount) {
		money -= amount;
	}
	
	public boolean isBrokeOut() {
		return money < 0;
	}
}

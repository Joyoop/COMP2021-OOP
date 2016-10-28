package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Random;
import java.util.Scanner;

public class HouseSquare extends Square {
	int price;
	int owner = -1;

	public HouseSquare(String name, int price) {
		super(name);
		this.price = price;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public static boolean getInput(){
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("Would you want to buy it?: 1 for yes, 2 for no:");
		if(scanner.hasNextInt())
			input = scanner.nextInt(); // if there is another number
		else
			input = 0;
		//input = scanner.nextInt();
		scanner.close();
		if(input == 1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void doAction(Player player, Board board) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		boolean input2 = false;
		System.out.println("Would you want to buy it?: 1 for yes, 2 for no:");
		if(scanner.hasNextInt())
			input = scanner.nextInt(); // if there is another number
		else
			input = 0;
		//input = scanner.nextInt();
		scanner.close();
		if(input == 1){
			input2 =  true;
		}else{
			input2 = false;
		}
		if(owner < 0){
			Util.print(player, player.getName() + ", do you want to buy " + getName() + "?");
			if(input2){
				Util.print(player, player.getName() + " buy " + getName() + " for " + price);
				owner = player.getID();
				player.getMoney().substractMoney(price);
			}else{
				Util.print(player, player.getName() + " don't want to buy " + getName());
			}
		}else{
			if(owner != player.getID()){
				int lost = price * 70 / 100;
				Util.print(player, player.getName() + " lost " + lost + " money to " + board.getPlayer(owner).getName());
				player.getMoney().substractMoney(lost);
				board.getPlayer(owner).getMoney().addMoney(lost);
			}
		}
	}
}

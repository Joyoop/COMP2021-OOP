package hk.edu.polyu.comp.comp2021.monopoly;

public class Util {
	public static void print(Player player, String msg) {
		System.out.println("[Turn " + (player.getTotalWalk() + 1) + "] [" + player.getCurrentPosition() + "] [$" + player.getMoney().getMoney() + "] " + msg);
	}
}

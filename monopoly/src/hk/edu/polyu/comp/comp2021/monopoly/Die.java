package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Random;

public class Die {

	public int getFace() {
		Random rand = new Random();
		int face = 1+rand.nextInt(4);
		return face;
	}
}

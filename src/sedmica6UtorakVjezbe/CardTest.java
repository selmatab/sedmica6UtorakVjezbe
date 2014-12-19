package sedmica6UtorakVjezbe;

import java.util.Scanner;

public class CardTest {
	public static void main(String[] args) {
		// Scanner in=new Scanner(System.in);
		// int broj=in.nextInt();

		Deck first = new Deck();
		for (int i = 0; i < 52; i++) {
			System.out.println(first.getCards()[i]);
		}

	}
}

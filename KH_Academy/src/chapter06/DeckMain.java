package chapter06;

import java.util.Collections;

public class DeckMain {

	public static void main(String[] args) {
		Deck deck = new Deck();

		Collections.shuffle(deck.getDeck());

		for (int i = 0; i < 5; i++) {
			System.out.println(deck.getDeck().get(i));
		}
	}

}

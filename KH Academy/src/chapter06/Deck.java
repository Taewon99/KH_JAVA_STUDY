package chapter06;

import java.util.ArrayList;

public class Deck extends Card {

	private ArrayList<String> deck;

	public Deck() {
		super();
		deck = new ArrayList<String>();
		for (int i = 0; i < getType().size(); i++) {
			for (int j = 0; j < getNum().size(); j++) {
				deck.add(getType().get(i) + " " + getNum().get(j));
			}
		}
	}

	public ArrayList<String> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<String> deck) {
		this.deck = deck;
	}

}

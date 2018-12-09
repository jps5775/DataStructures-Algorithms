package CTCI.Chapter_7_OOD.Deck_of_Cards;

import java.util.ArrayList;

public class Hand <T extends Card> {
	protected ArrayList<T> cards = new ArrayList<T>();
	
	public int score() {
		int score = 0;
		for(T card : cards) {
			score += card.getValue();
		}
		return score;
	}
	
	public void addCard(T card) {
		cards.add(card);
	}
	
}

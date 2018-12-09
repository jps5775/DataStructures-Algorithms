package CTCI.Chapter_7_OOD.Deck_of_Cards;

public abstract class Card {
	private boolean available = true;
	protected int faceValue;
	protected Suit suit;
	
	public Card(int faceValue, Suit suit){
		this.faceValue = faceValue;
		this.suit = suit;
	}
	
	// We have also implemented Card as an abstract class, 
	// since methods like getValue() don't make much sense 
	// without a specific game attached to them.
	public abstract int getValue();
	public Suit getSuit() { return suit; }
	
	// checks if card is available to be given out to someone
	public boolean isAvailable() { return available; }
	public void markUnavailable() { this.available = false; }
	public void markAvailable() { this.available = true; }
	
}

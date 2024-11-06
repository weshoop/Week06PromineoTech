package week05project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	
	
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score " + score);
		System.out.println("Hand: ");
		for (Card card: hand) {
			card.describe();
		}
	}
	public Card flip () {
		return hand.remove(0); 
		
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		score++;
	}
}

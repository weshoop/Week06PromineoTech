package week05project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
 	private List<Card> cards = new ArrayList<Card>();

	
 		public Deck() {
 			cards = new ArrayList<>();
 			int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
 			String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
 			String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
 			
 			for (String suit: suits) {
 				for (int i = 0; i < values.length; i++) {
 					String name = ranks[i] + " of " + suit;
 					int value = values[i];
 					cards.add(new Card(value, name));
 				}
 			}
 		}
 	public void shuffle () {
 		Collections.shuffle(cards);
 	}
 	public Card draw () {
 		return cards.remove(0); 
 	}
}

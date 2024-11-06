package week05project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck); // Draw for player 1
			} else {
				player2.draw(deck); // Draw for player 2
			}
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins this round with: " + card1.getName() + " vs " + card2.getName());
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins this round with: " + card2.getName() + " vs " + card1.getName());
			} else {
				System.out.println("It is a tie! Both players flipped: " + card1.getName());
			}
		}
		
		System.out.println("\n" + "Final Score:");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore() + "\n");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 Wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 Wins!");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("Its a Draw!");
		}
		
		
	}

}

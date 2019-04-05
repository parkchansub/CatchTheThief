import java.util.Arrays;
import java.util.List;

public class Game {
	
	public void play(){
		System.out.println("=======CatchTheThief=======");
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		List<Player> players = Arrays.asList(player1,player2);
		
		Rule rule = new Rule();
		CardDeck cardDeck = new CardDeck();
		
		
		
	}
	

}

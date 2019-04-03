import java.util.LinkedList;
import java.util.List;


public class CardDeck {
	private List<Card> cards;
	private static final String[] PATTERNS = {"spade","heart","diamond","club","Joker"};
	private static final int CARD_COUNT = 13;
	
	private List<Card> generateCards(){
		cards = new LinkedList();
		
		for(String pattern : PATTERNS){
			if(!pattern.equals("Joker")){
				for(int i=1;i<=CARD_COUNT;i++){
					cards.add(new Card(pattern , i));
				}
			}else{
				cards.add(new Card("Joker", 0));
			}
		}
		return cards;
	}
	
	  public Card draw(){
	    	Card selectedCard = getRandomCard();
	    	cards.remove(selectedCard);
	    	return selectedCard;
	    }
	    
	    private Card getRandomCard(){
	    	int size = cards.size();
	    	
	    	int select = (int)(Math.random()*size);
	    	return cards.get(select);
	    }
}

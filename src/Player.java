import java.util.LinkedList;
import java.util.List;

public class Player {
	private List<Card> cards;
	private String name;
	private boolean holdingJokerFlag = false;
	
	public Player(String name){
		cards = new LinkedList<>();
		this.name = name;
	}
	
	public void addCardList(Card card){
		
	}
	
	public boolean holdingJokerYN(){
		for(Card card : cards){
			if(card.getNumber().equals("0")){
				holdingJokerFlag = true;
			}
		}
		return holdingJokerFlag;
	}
	
	public void sameCardNumberCheck(Card inputCard){
		for(Card card : cards){
			if(inputCard.getNumber() == card.getNumber()){
				
			}
		}
	}
	
	public void romoveCard(){
		
	}
	public String getName() {
		return name;
	}


	
}

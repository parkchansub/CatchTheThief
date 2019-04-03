import java.util.Stack;

public class Player {
	private Stack<Card> cards;
	private String name;
	private boolean holdingJokerFlag = false;
	
	public Player(String name){
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
				
	}
	
	public void romoveCard(){
		
	}
	public String getName() {
		return name;
	}


	
}

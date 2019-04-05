import java.util.Stack;

public class Player {
	private Stack<Card> cards;
	private String name;
	private boolean holdingJokerFlag = false;
	
	public Player(String name){
		this.name = name;
	}
	
	public void addCard(Card card){
		if(!sameCardNumberCheck(card)){
			cards.add(card);
		}
	}
	
	public boolean holdingJokerYN(){
		for(Card card : cards){
			if(card.getNumber().equals("0")){
				holdingJokerFlag = true;
			}
		}
		return holdingJokerFlag;
	}
	
	public boolean sameCardNumberCheck(Card inputCard){
		int i=0;
				for(Card card : cards){
					i++;
					if(card.getNumber() == inputCard.getNumber()){
						cards.remove(i);
						return true;
					}
				}
				return false;
	}
	
	public String getName() {
		return name;
	}


	
}

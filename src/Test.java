import java.util.Stack;

public class Test {
	private Stack<Card> cards;
	
	
	public static void main(String[] args) {
		
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
}

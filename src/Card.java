
public class Card {
	private String pattern;
	private String number;
	
	public Card(String pattern, int number){
		this.number = numberToDenomination(number);
		this.pattern = pattern;
	}
	
	private String numberToDenomination(int number){
		if(number==1){
			return "A";
		}else if(number==11){
			return "J";
		}else if(number==12){
			return "Q";
		}else if(number==13){
			return "k";
		}else{
			return String.valueOf(number);
		}
	}

	public String getNumber() {
		return number;
	}

	
}

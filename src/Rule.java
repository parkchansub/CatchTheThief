import java.util.List;

public class Rule {
	
	public void checkJokerCard(List<Player> playerList){
		String hodingJokerCardPlayer = "";
		for(Player player : playerList){
			if(player.holdingJokerYN()){
				hodingJokerCardPlayer =  player.getName();
			}
		}
		System.out.println("현재 JOKER카드를 가지고 있는 사람은 :" +hodingJokerCardPlayer);
	}
}

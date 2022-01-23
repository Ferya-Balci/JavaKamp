package gameSimulator;


import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player1=new Player();
		player1.setFirstName("Ferya");
		player1.setLastName("Balcý");
		player1.setId(1);
		player1.setNationalityId("123456789456");
		player1.setDateOfBirth(1998);
		
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		
		Game game1=new Game();
		game1.setGameName("Oyun 1");
		game1.setPrice(1560);
		game1.setId(1);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Kampanya 1");
		campaign1.setDiscount(25);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		gameSaleManager.gameSell(game1, player1, campaign1);
		

	}

}

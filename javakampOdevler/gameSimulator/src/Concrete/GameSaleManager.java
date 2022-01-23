package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSell(Game game, Player player, Campaign campaign) {
		double discountedPrice=game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		
		System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli oyuncu, "
				+game.getGameName()+" oyununu "+game.getPrice()+" fiyatý üzerinden "
				+campaign.getDiscount()+" indirim oranýyla "+discountedPrice+ "fiyatýna satýn almýþtýr.");
		
	}

}

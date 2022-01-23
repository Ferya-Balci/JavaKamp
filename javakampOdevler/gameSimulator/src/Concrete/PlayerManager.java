package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu kaydedildi:  "+player.getFirstName()+" "+player.getLastName());
		}
		else {
			System.out.println("Kayd�n�z ba�ar�s�z.Bilgilerinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+"  Bilgileriniz g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+"  �simli oyuncu silindi.");
		
	}
	
	

}

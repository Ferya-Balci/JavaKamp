package Adapters;




import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getDateOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return false;
		
	}
	
	

	
}

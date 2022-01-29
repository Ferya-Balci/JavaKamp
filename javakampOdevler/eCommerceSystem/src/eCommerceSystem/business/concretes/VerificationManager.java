package eCommerceSystem.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.business.abstracts.VerificationService;
import eCommerceSystem.entities.concretes.User;

public class VerificationManager implements VerificationService {
	
	UserCheckManager userCheckManager;
	List<String> verificatedMail=new ArrayList<String>();

	@Override
	public void sendToVerifyMail(User user) {
		System.out.println(user.getFirstName()+", "+user.geteMail()+" mail adresinize doðrulama kodu gönderildi.");
		
	}

	@Override
	public void verifyMail(User user) {
		verificatedMail.add(user.geteMail()+" mailiniz baþarýyla doðrulandý.");
		
	}

	
}

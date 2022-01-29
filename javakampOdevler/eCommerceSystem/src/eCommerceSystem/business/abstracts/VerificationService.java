package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface VerificationService {
	
	void sendToVerifyMail(User user);
	void verifyMail(User user);


}

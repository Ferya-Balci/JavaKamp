package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface UserCheckService {
	
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean uniqueMail(User user);
	boolean isValid(User user);

}

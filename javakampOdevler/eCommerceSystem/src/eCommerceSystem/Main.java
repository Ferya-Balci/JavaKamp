package eCommerceSystem;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.UserCheckManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.business.concretes.VerificationManager;
import eCommerceSystem.core.GoogleManagerAdapter;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new UserCheckManager(), new VerificationManager(),new HibernateUserDao(),new GoogleManagerAdapter());
        User user=new User(1,"Ferya","Balcý","ferya@email.com","1234567");
        userService.register(user);
	}

}

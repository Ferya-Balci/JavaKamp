package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.abstracts.VerificationService;
import eCommerceSystem.core.GoogleService;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private UserDao userDao;
	private GoogleService googleService;
	
	

	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao,GoogleService googleService) {
		super();
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.googleService=googleService;
	}

	@Override
	public void register(User user) {
		if(userCheckService.isValid(user) == true){
			System.out.println(user.getFirstName() + " isimli kullanýcý baþarýlý bir þekilde kayýt oldu.");
			verificationService.sendToVerifyMail(user);
			userDao.register(user);
			googleService.register("Kullanýcý google hesabý ile kayýt oldu.");

		}
		
	}

	@Override
	public void confirm(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user) {

		if((userCheckService.checkEmail(user)&& userCheckService.checkPassword(user))==true) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" giriþ baþarýlý.");
		}
		else {
			System.out.println("Giriþ baþarýsýz.");
		}
		
	}

}

package eCommerceSystem.core;

import eCommerceSystem.googleAccount.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	GoogleManager googleManager=new GoogleManager();
	@Override
	public void register(String message) {
		googleManager.register(message);
		
	}

	@Override
	public void login(String message) {
		googleManager.login(message);
		
	}

}

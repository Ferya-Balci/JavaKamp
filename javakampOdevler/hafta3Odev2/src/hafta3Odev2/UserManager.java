package hafta3Odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getEmail() + "  hesab� sisteme kaydedildi");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}
	}
	 
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+"  kursa giri� yapt�.");
	}
	
	public void loginMultiple(User[] users) {
		for(User user:users) {
			login(user);
		}
	}
}

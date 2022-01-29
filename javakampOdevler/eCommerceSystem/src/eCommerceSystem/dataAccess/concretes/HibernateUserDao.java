package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kayýt oldu.");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.geteMail()+" mail adresi doðrulandý.");
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" giriþ yaptý.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" kullancýsý güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullanýcýsý silindi.");
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}

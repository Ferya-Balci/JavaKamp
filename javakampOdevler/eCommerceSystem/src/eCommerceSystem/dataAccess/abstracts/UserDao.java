package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void confirm(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	
	User get(int id);
    List<User> getAll();
	
	

}

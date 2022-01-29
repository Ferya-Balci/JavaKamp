package eCommerceSystem.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkEmail(User user) {
		Pattern regexEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		Matcher matcher = regexEmail.matcher(user.geteMail());
		
		if(matcher.matches()){
			System.out.println("Email formatý uygun");
			
			return true;
		}
		else 
		{
			System.out.println("Email uygun deðildir!");
			return false;
		}
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Geçerli parola.");
			return true;
		}
		else {
			System.out.println("Geçersiz parola.Lütfen en az 6 karakter giriniz.");
		}
		return false;
	}

	@Override
	public boolean uniqueMail(User user) {
		 
		boolean result = true;
		if(listOfEmail.contains(user.geteMail())) {
			System.out.println("Bu email adresi ile daha önce kayýt yapýlmýþ. Lütfen farklý bir mail deneyiniz");
			return false;
		}
		else {
			result = true;
			listOfEmail.add(user.geteMail());
		}
		return result;
	}

	@Override
	public boolean isValid(User user) {
		if(checkEmail(user) && checkPassword(user) && uniqueMail(user) == true)  {
			return true;
		}
		return false;
	
	}

}

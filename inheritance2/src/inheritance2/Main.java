package inheritance2;

public class Main {

	public static void main(String[] args) {
		
	 //Müþteri ekleme.
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());

	}

}

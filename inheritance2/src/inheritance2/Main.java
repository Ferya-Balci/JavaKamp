package inheritance2;

public class Main {

	public static void main(String[] args) {
		
	 //M��teri ekleme.
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());

	}

}

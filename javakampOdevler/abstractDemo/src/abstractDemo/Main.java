package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		//stratejiyi belirliyoruz.
		customerManager.databaseManager=new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}

package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
		//Kullanırken hangi Db sistemi verilirse onun getDatası çalışır.
	}
}

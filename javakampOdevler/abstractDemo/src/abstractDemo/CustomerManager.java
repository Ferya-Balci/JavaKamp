package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
		//Kullan�rken hangi Db sistemi verilirse onun getDatas� �al���r.
	}
}

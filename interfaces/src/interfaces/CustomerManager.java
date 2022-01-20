package interfaces;

public class CustomerManager {
//loosly(gevþek)-tightly(katý) baðlý
	
	//çoklu loglama özelliði için
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
	       this.loggers = loggers;
    }

	public void add(Customer customer) {
		
		System.out.println("Müþteri eklendi:  "+customer.getFirstName());
		//interface-loglamalarý dahil etmeliyiz.
		
		Utils.runLoggers(loggers,customer.getFirstName());
		
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi:  "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		
	}
}

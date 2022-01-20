package interfaces;

public class CustomerManager {
//loosly(gev�ek)-tightly(kat�) ba�l�
	
	//�oklu loglama �zelli�i i�in
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
	       this.loggers = loggers;
    }

	public void add(Customer customer) {
		
		System.out.println("M��teri eklendi:  "+customer.getFirstName());
		//interface-loglamalar� dahil etmeliyiz.
		
		Utils.runLoggers(loggers,customer.getFirstName());
		
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi:  "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		
	}
}

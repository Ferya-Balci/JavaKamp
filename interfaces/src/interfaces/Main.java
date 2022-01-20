package interfaces;

public class Main {

	public static void main(String[] args) {
		//M��teri i�in g�nderilecek loggerlar
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new FileLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer engin=new Customer(1,"Engin","Demiro�");
		customerManager.add(engin);

	}

}

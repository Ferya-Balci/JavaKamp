package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {

	//override-�zerine yazma
	public void log(String message) {
		System.out.println("Logged to database  : "+message);
	}
}

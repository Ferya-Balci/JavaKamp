package inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Bireysel m��teri olu�tural�m.
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber= "12345";
		
		//Kurumsal m��teri olu�tural�m.
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber= "78910";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="99999";
		
		//ekleme i�lemi CustomerManager s�n�f�nda old i�in onu nesne olarak ekliyoruz.
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {engin,abc,hepsiBurada};	
		customerManager.addMultiple(customers);
		/*customerManager.add(hepsiBurada);//Ticari
		customerManager.add(engin);//Bireysel g�ndermi� olduk.
		customerManager.add(abc);*/

	}

}

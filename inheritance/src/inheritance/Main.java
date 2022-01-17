package inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Bireysel müþteri oluþturalým.
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber= "12345";
		
		//Kurumsal müþteri oluþturalým.
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber= "78910";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="99999";
		
		//ekleme iþlemi CustomerManager sýnýfýnda old için onu nesne olarak ekliyoruz.
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {engin,abc,hepsiBurada};	
		customerManager.addMultiple(customers);
		/*customerManager.add(hepsiBurada);//Ticari
		customerManager.add(engin);//Bireysel göndermiþ olduk.
		customerManager.add(abc);*/

	}

}

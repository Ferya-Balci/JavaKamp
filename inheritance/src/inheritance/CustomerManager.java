package inheritance;
//M��teriyi y�netecek,ilgili operasyonlar� i�erecek s�n�f
public class CustomerManager {

	//base s�n�f� kulland�k.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber  +  " kaydedildi.");
	}
	
	//Ayn� anda birden fazla m��teri eklemek istiyoruz.�oklu ekleme.
	//bulk insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			add(customer);//G�nd.arraydeki m�� dola��p her bir m�� i�in add i �al��t�r�r
		}
	}
	

	
}

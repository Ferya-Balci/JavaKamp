package inheritance;
//Müþteriyi yönetecek,ilgili operasyonlarý içerecek sýnýf
public class CustomerManager {

	//base sýnýfý kullandýk.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber  +  " kaydedildi.");
	}
	
	//Ayný anda birden fazla müþteri eklemek istiyoruz.Çoklu ekleme.
	//bulk insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			add(customer);//Gönd.arraydeki müþ dolaþýp her bir müþ için add i çalýþtýrýr
		}
	}
	

	
}

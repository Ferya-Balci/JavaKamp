package classesWithAttributes;

public class ProductManager {

	//Do�ru kullan�m:�zellikleri ba�ka classta tutup ordan �ekmek.
	public void Add(Product product) {
		System.out.println("�r�n eklendi."+product.getName());
	}
	
	//Encapsulation //�ok hatal� bir kullan�m!
	//Bir�ok ekranda bunu yazd�k diyelim bir de�i�iklik yapmak istedi�imizde hepsini tek tek yapmak gerekir.
	/*public void Add2(int id,String name,String description,double price,int stockAmount) {
		
	}*/
}

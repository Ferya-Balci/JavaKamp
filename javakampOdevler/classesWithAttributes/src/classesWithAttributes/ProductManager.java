package classesWithAttributes;

public class ProductManager {

	//Doðru kullaným:Özellikleri baþka classta tutup ordan çekmek.
	public void Add(Product product) {
		System.out.println("Ürün eklendi."+product.getName());
	}
	
	//Encapsulation //Çok hatalý bir kullaným!
	//Birçok ekranda bunu yazdýk diyelim bir deðiþiklik yapmak istediðimizde hepsini tek tek yapmak gerekir.
	/*public void Add2(int id,String name,String description,double price,int stockAmount) {
		
	}*/
}

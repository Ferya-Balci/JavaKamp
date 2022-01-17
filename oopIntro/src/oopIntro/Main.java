package oopIntro;

public class Main {

	public static void main(String[] args) {
		//örnek oluþturma,referans oluþturma,instance oluþturma
		//constructor'dan çektik
		Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram",10);
		//--Kümülatif bir þekilde bir ürün nesnesi oluþturmuþ olduk.
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());//indirim sonrasý fiyatý okuduk.
		
		//Yazma-Set Ýþlemi
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		//Okuma-Get Ýþlemi
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*Product product3=new Product();
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
	   //3 tane verim var ,o verilerin türü product
	   //veri kaynaðý.Gerçekte getproduct ile veritabanýndan çekilir.
		Product[] products= {product1,product2,product3};
		//her bir elemaný dolaþ.Product veri türü
		for (Product product:products) {
			System.out.println(product.name);
			
		}
		//eleman sayýsý
		System.out.println(products.length);
		
		//--Category
        Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category()
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		//Bir class'ýn kaynaklarýný kullamnacaðýn zaman onu new'lemek gerekiyor.
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);//bu þekilde istediðimiz kadar çaðýrabiliriz.
		//Deðiþiklik yapacaðýmýzda tek yerden yaparýz.
		//Sepete ne ekliycek?Mthod bir dataya ihtiyaç duyuyorsa parantez içine parametre girilir.
		productManager.addToCart(product2);//productýn adresini gönderdik.
		productManager.addToCart(product3);*/
		
		
	}

}

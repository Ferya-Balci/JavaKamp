package oopIntro;

public class Main {

	public static void main(String[] args) {
		//�rnek olu�turma,referans olu�turma,instance olu�turma
		//constructor'dan �ektik
		Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram",10);
		//--K�m�latif bir �ekilde bir �r�n nesnesi olu�turmu� olduk.
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());//indirim sonras� fiyat� okuduk.
		
		//Yazma-Set ��lemi
		Category category1=new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		//Okuma-Get ��lemi
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*Product product3=new Product();
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
	   //3 tane verim var ,o verilerin t�r� product
	   //veri kayna��.Ger�ekte getproduct ile veritaban�ndan �ekilir.
		Product[] products= {product1,product2,product3};
		//her bir eleman� dola�.Product veri t�r�
		for (Product product:products) {
			System.out.println(product.name);
			
		}
		//eleman say�s�
		System.out.println(products.length);
		
		//--Category
        Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category()
		category2.id=2;
		category2.name="Ev/Bah�e";
		
		//Bir class'�n kaynaklar�n� kullamnaca��n zaman onu new'lemek gerekiyor.
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);//bu �ekilde istedi�imiz kadar �a��rabiliriz.
		//De�i�iklik yapaca��m�zda tek yerden yapar�z.
		//Sepete ne ekliycek?Mthod bir dataya ihtiya� duyuyorsa parantez i�ine parametre girilir.
		productManager.addToCart(product2);//product�n adresini g�nderdik.
		productManager.addToCart(product3);*/
		
		
	}

}

package classes;

public class Main {

	public static void main(String[] args) {
		//Temel özellik gruplama.Ürün ekleme,silme,güncelleme
		//İlgili alanlarda class oluştururuz.
		
		//Bellekte CustomerManager türünde bir nesne oluşturduk.
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
	    customerManager=customerManager2;//ikisinin referansı aynı old için:
	    //CustomerManager customerManager; yazsak da sorun olmnazdı
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		//Cevap 10.Çünkü:int,double,float,byte değer(value) tiptir.
		//Değer tipte tanımlanan her şey stackte oluşur.Heaple alakası yok.
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		//Diziler referans tiptir.
		//iki dizide heapte aynı referansa bakar.iki dizi tek nesneyi tutuyor gibi.101e bakar.Cevap 10
		
	}

}



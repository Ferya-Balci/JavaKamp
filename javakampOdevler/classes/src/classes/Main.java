package classes;

public class Main {

	public static void main(String[] args) {
		//Temel �zellik gruplama.�r�n ekleme,silme,g�ncelleme
		//�lgili alanlarda class olu�tururuz.
		
		//Bellekte CustomerManager t�r�nde bir nesne olu�turduk.
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
	    customerManager=customerManager2;//ikisinin referans� ayn� old i�in:
	    //CustomerManager customerManager; yazsak da sorun olmnazd�
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		//Cevap 10.��nk�:int,double,float,byte de�er(value) tiptir.
		//De�er tipte tan�mlanan her �ey stackte olu�ur.Heaple alakas� yok.
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		//Diziler referans tiptir.
		//iki dizide heapte ayn� referansa bakar.iki dizi tek nesneyi tutuyor gibi.101e bakar.Cevap 10
		
	}

}



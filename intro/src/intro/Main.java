package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		
		//metinsel veri
		String internetSubeButonu="�nternet �ubesi";
		//say�sal veri
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		//Diziler-Array
		String [] krediler= {
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"K�lt�r Bakanl��� Kredisi"
		        };
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);
		
		//�dev-3
		
		
		
	}

}

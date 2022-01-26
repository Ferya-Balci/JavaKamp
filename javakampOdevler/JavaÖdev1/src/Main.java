
public class Main {

	public static void main(String[] args) {
		
   /*  System.out.println("Merhaba Java");
   
   //Variables
     int ogrenciSayisi=11;
     String mesaj="Öðrenci sayýsý: ";
     System.out.println(mesaj+ogrenciSayisi);
     System.out.println(mesaj+ogrenciSayisi);
     System.out.println("Öðrenci sayým: "+ogrenciSayisi);
     System.out.println("Öðrenci sayým: "+ogrenciSayisi);
     
    //data types
     int sayi=12;
     
    //If Bloklarý(Þart)
     int sayi=20;
     if(sayi<20) {
    	 System.out.println("Sayý 20'den küçüktür");
     }
     else if(sayi==20) {
    	 System.out.println("Sayý 20'ye eþittir.");
     }
     else {
    	 System.out.println("Sayý 20'den büyüktür");
     }
     
		//En büyük sayýyý bulma
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		int enBuyuk=sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		else if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println(enBuyuk);
		
		//Switch Bloklarý
		char grade='X';
		
		switch(grade) {
		      case 'A':
		    	  System.out.println("Geçtiniz.Mükemmel");
		    	  break;
		      case 'B':
		    	  System.out.println("Çok güzel.Geçtiniz");
		    	  break;
		      case 'C':
		    	  System.out.println("Ýyi.Geçtiniz");
		    	  break;
		      case 'D':
		    	  System.out.println("Fena Deðil.Geçtiniz");
		    	  break;
		      case 'F':
		    	  System.out.println("Maalesef kaldýnýz");
		    	  break;
		      default:
		    	  System.out.println("Geçersiz not girdiniz.");
		    	  
		
		//For Döngüsü
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
			}
		System.out.println("For Döngüsü Bitti."); 
		
		//While Döngüsü
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti.");
		
		//Do-While Döngüsü
		//Þart uymasa bile mutlaka bir kere çalýþýr.
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti.");
		
		
		//Diziler-Arrays
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ferya";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		//for'un 2. yaygýn yöntemi--dizinin tüm elemanlarýný gezer.
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		//reCap Demo-Dizi
		double[] myList= {1.2,1.3,4.3,5.6,};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Toplam= "+total);
		System.out.println("Max= "+max); 
		
		//Çok Boyutlu Diziler
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakýr";
		sehirler[2][1]="Þanlýurfa";
		sehirler[2][2]="Gaziantep";
		//iç içe döngü
		for(int i=0;i<=2;i++) {
			System.out.println("-------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
		//Stringlerle Çalýþmak
		  //Stringler bir karakter dizisidir.char array
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý: "+mesaj.length());
		//i.elemaný bulur
		System.out.println("5.eleman: "+mesaj.charAt(4));
		//stringleri birleþtirir
		System.out.println(mesaj.concat("Yaþasýn!"));
		//Ne ile baþlýyor?true veya false döndürür.
		System.out.println(mesaj.startsWith("B"));
		//Ne ile bitiyor?Büyük-küçük harf duyarlý!
		System.out.println(mesaj.endsWith("."));
		//Karakterleri getiriyor.bir char array döndürür.
		char[] karakterler=new char[5];
		//0-4'e kadar karakterler dizisine ata.diziye 0'dan itibaren ata.
		mesaj.getChars(0, 5,karakterler,0);//5 dahil deðil
		System.out.println(karakterler);
		//Karakter kaçýncý indexte bulur.
		System.out.println(mesaj.indexOf('a'));
		//karakteri aramaya en sondan baþlar.
		System.out.println(mesaj.lastIndexOf('a'));
		//---String Fonksiyonlarý----
		//Replace--karakterleri deðiþtirmek
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		//Substring--Metnin içerisinden parça almak
		System.out.println(mesaj.substring(2));//2.indexten itibaren sona kadar kes
		System.out.println(mesaj.substring(2, 5));//5'e kadar.
		//Split--Metni bir karakter dizisini baz alarak parçalamaya yarar.
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			}
		
		 //toLowerCase--Küçük harfe çevirir
	     System.out.println(mesaj.toLowerCase());
	     System.out.println(mesaj.toUpperCase());
	     //boþluklarý kaldýrýr
	     String yazi="      Çok güzel bir isim.    ";
	     System.out.println(yazi.trim()); 
	     */
		
		
		}
	
	   
		
	}




public class Main {

	public static void main(String[] args) {
		
   /*  System.out.println("Merhaba Java");
   
   //Variables
     int ogrenciSayisi=11;
     String mesaj="��renci say�s�: ";
     System.out.println(mesaj+ogrenciSayisi);
     System.out.println(mesaj+ogrenciSayisi);
     System.out.println("��renci say�m: "+ogrenciSayisi);
     System.out.println("��renci say�m: "+ogrenciSayisi);
     
    //data types
     int sayi=12;
     
    //If Bloklar�(�art)
     int sayi=20;
     if(sayi<20) {
    	 System.out.println("Say� 20'den k���kt�r");
     }
     else if(sayi==20) {
    	 System.out.println("Say� 20'ye e�ittir.");
     }
     else {
    	 System.out.println("Say� 20'den b�y�kt�r");
     }
     
		//En b�y�k say�y� bulma
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
		
		//Switch Bloklar�
		char grade='X';
		
		switch(grade) {
		      case 'A':
		    	  System.out.println("Ge�tiniz.M�kemmel");
		    	  break;
		      case 'B':
		    	  System.out.println("�ok g�zel.Ge�tiniz");
		    	  break;
		      case 'C':
		    	  System.out.println("�yi.Ge�tiniz");
		    	  break;
		      case 'D':
		    	  System.out.println("Fena De�il.Ge�tiniz");
		    	  break;
		      case 'F':
		    	  System.out.println("Maalesef kald�n�z");
		    	  break;
		      default:
		    	  System.out.println("Ge�ersiz not girdiniz.");
		    	  
		
		//For D�ng�s�
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
			}
		System.out.println("For D�ng�s� Bitti."); 
		
		//While D�ng�s�
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While D�ng�s� Bitti.");
		
		//Do-While D�ng�s�
		//�art uymasa bile mutlaka bir kere �al���r.
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While D�ng�s� Bitti.");
		
		
		//Diziler-Arrays
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ferya";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		//for'un 2. yayg�n y�ntemi--dizinin t�m elemanlar�n� gezer.
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
		
		//�ok Boyutlu Diziler
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="�stanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbak�r";
		sehirler[2][1]="�anl�urfa";
		sehirler[2][2]="Gaziantep";
		//i� i�e d�ng�
		for(int i=0;i<=2;i++) {
			System.out.println("-------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
		//Stringlerle �al��mak
		  //Stringler bir karakter dizisidir.char array
		String mesaj="Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+mesaj.length());
		//i.eleman� bulur
		System.out.println("5.eleman: "+mesaj.charAt(4));
		//stringleri birle�tirir
		System.out.println(mesaj.concat("Ya�as�n!"));
		//Ne ile ba�l�yor?true veya false d�nd�r�r.
		System.out.println(mesaj.startsWith("B"));
		//Ne ile bitiyor?B�y�k-k���k harf duyarl�!
		System.out.println(mesaj.endsWith("."));
		//Karakterleri getiriyor.bir char array d�nd�r�r.
		char[] karakterler=new char[5];
		//0-4'e kadar karakterler dizisine ata.diziye 0'dan itibaren ata.
		mesaj.getChars(0, 5,karakterler,0);//5 dahil de�il
		System.out.println(karakterler);
		//Karakter ka��nc� indexte bulur.
		System.out.println(mesaj.indexOf('a'));
		//karakteri aramaya en sondan ba�lar.
		System.out.println(mesaj.lastIndexOf('a'));
		//---String Fonksiyonlar�----
		//Replace--karakterleri de�i�tirmek
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		//Substring--Metnin i�erisinden par�a almak
		System.out.println(mesaj.substring(2));//2.indexten itibaren sona kadar kes
		System.out.println(mesaj.substring(2, 5));//5'e kadar.
		//Split--Metni bir karakter dizisini baz alarak par�alamaya yarar.
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			}
		
		 //toLowerCase--K���k harfe �evirir
	     System.out.println(mesaj.toLowerCase());
	     System.out.println(mesaj.toUpperCase());
	     //bo�luklar� kald�r�r
	     String yazi="      �ok g�zel bir isim.    ";
	     System.out.println(yazi.trim()); 
	     */
		
		
		}
	
	   
		
	}



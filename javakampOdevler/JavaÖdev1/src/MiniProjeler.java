
public class MiniProjeler {

	public static void main(String[] args) {
		//---MÝNÝ PROJE1--Sayý Asal Mý?
		/*int number=1;
		int remainder=number%2;
		//System.out.println(remainder);

		boolean isPrime=true;//baþta asal aldýk.
		//if(number==1) {System.out.println("Sayý asal deðildir.");return;}
		if(number<1) {
			System.out.println("Geçersiz sayý");
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		//==true ile ayný þey
		if(isPrime==true && number!=1) {
			System.out.println("Sayý asaldýr.");
		}
		else{
			System.out.println("Sayý asal deðildir.");
		}
		
		//MÝNÝ PROJE2-Kalýn sesli ve ince sesli harfler
		char harf='x';
		switch(harf) {
		      case 'A':
		      case 'I':
		      case 'O':
		      case 'U':
		    	  System.out.println("Kalýn sesli harftir.");
		    	  break;
		      case 'E':
		      case 'Ý':
		      case 'Ö':
		      case 'Ü':
		    	  System.out.println("Ýnce sesli harftir.");
		    	  break;
		      default:
		    	  System.out.println("Geçersiz karakter.");
			
		//MÝNÝ PROJE3--Mükemmel Sayýlar
		  //6-->1,2,3--1+2+3=6
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}		
		}
		if(total==number) {
			System.out.println(number+" Mükemmel sayýdýr.");
		}
		else {
			System.out.println("Mükemmel sayý deðildir.");
		}
		
		//MÝNÝ PROJE4--Arkadaþ Sayýlar
		  //220-284--1'den baþlayýp 220'ye kadar tüm pozitif bölenlerinin toplamý 284 ise arkadaþ sayý.
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1+=i;
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2+=i;
			}
		}
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println(sayi1+" "+sayi2+" Arkadaþ sayýlardýr.");
		}
		else {
			System.out.println("Arakadaþ satý deðillerdir.");
		}
		*/
		
		//MÝNÝ PROJE5--Sayý Bulma
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		/*for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Aranan sayý bulundu--> "+sayilar[i]);
				System.out.println("Aranan sayý dizinin "+(i+1)+". elemaný");
			}
		}
		*/
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayý mevcuttur.");
		}
		else {
			System.out.println("Sayý mevcut deðildir.");
		}
		
		
		}
	}



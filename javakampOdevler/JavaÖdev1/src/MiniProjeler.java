
public class MiniProjeler {

	public static void main(String[] args) {
		//---M�N� PROJE1--Say� Asal M�?
		/*int number=1;
		int remainder=number%2;
		//System.out.println(remainder);

		boolean isPrime=true;//ba�ta asal ald�k.
		//if(number==1) {System.out.println("Say� asal de�ildir.");return;}
		if(number<1) {
			System.out.println("Ge�ersiz say�");
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		//==true ile ayn� �ey
		if(isPrime==true && number!=1) {
			System.out.println("Say� asald�r.");
		}
		else{
			System.out.println("Say� asal de�ildir.");
		}
		
		//M�N� PROJE2-Kal�n sesli ve ince sesli harfler
		char harf='x';
		switch(harf) {
		      case 'A':
		      case 'I':
		      case 'O':
		      case 'U':
		    	  System.out.println("Kal�n sesli harftir.");
		    	  break;
		      case 'E':
		      case '�':
		      case '�':
		      case '�':
		    	  System.out.println("�nce sesli harftir.");
		    	  break;
		      default:
		    	  System.out.println("Ge�ersiz karakter.");
			
		//M�N� PROJE3--M�kemmel Say�lar
		  //6-->1,2,3--1+2+3=6
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}		
		}
		if(total==number) {
			System.out.println(number+" M�kemmel say�d�r.");
		}
		else {
			System.out.println("M�kemmel say� de�ildir.");
		}
		
		//M�N� PROJE4--Arkada� Say�lar
		  //220-284--1'den ba�lay�p 220'ye kadar t�m pozitif b�lenlerinin toplam� 284 ise arkada� say�.
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
			System.out.println(sayi1+" "+sayi2+" Arkada� say�lard�r.");
		}
		else {
			System.out.println("Arakada� sat� de�illerdir.");
		}
		*/
		
		//M�N� PROJE5--Say� Bulma
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		/*for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Aranan say� bulundu--> "+sayilar[i]);
				System.out.println("Aranan say� dizinin "+(i+1)+". eleman�");
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
			System.out.println("Say� mevcuttur.");
		}
		else {
			System.out.println("Say� mevcut de�ildir.");
		}
		
		
		}
	}



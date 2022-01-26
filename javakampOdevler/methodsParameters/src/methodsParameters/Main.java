package methodsParameters;

public class Main {

	public static void main(String[] args) {
	String mesaj="Bug�n hava �ok g�zel";
	//substringte olu�an de�eri yeni de�i�kene atad���m�zda sonucu g�rd�k.
	//String yeniMesaj=mesaj.substring(0, 2);//de�er d�nd�r�yor
	String yeniMesaj=sehirVer();
	System.out.println(yeniMesaj);
    int sayi=topla(5,7);
    System.out.println(sayi);
    int toplam=topla2(2,3,4,5,6,10);//arka planda bunu diziye �eviriyor.
	System.out.println(toplam);
	}
	
	 public static void ekle() {
			System.out.println("Eklendi");
		      }
		   public static void sil() {
			System.out.println("Silindi");
		       }
		    public static void guncelle() {
			System.out.println("G�ncellendi");
		       }
      //int t�r�nde de�er d�dnd�ren method    
      public static int topla(int sayi1,int sayi2) {
    	  return sayi1+sayi2;
      }
      
      //Variable arguments-->istedi�im kadar parametre,arg�man g�ndericek �ekilde kullanmak i�in
      //Buraya g�nderdi�imiz say�lar asl�nda int array gibi �al���yor
      public static int topla2(int... sayilar) {
    	  int toplam=0;
    	  for(int sayi:sayilar) {//sayilar asl�nda dizi
    		  toplam+=sayi;
    	  }
    	  return toplam;
      }
      public static String sehirVer() {
    	  return "Ankara";
      }
		    

}

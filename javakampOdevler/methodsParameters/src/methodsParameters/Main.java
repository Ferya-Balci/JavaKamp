package methodsParameters;

public class Main {

	public static void main(String[] args) {
	String mesaj="Bugün hava Çok güzel";
	//substringte oluþan deðeri yeni deðiþkene atadýðýmýzda sonucu gördük.
	//String yeniMesaj=mesaj.substring(0, 2);//deðer döndürüyor
	String yeniMesaj=sehirVer();
	System.out.println(yeniMesaj);
    int sayi=topla(5,7);
    System.out.println(sayi);
    int toplam=topla2(2,3,4,5,6,10);//arka planda bunu diziye çeviriyor.
	System.out.println(toplam);
	}
	
	 public static void ekle() {
			System.out.println("Eklendi");
		      }
		   public static void sil() {
			System.out.println("Silindi");
		       }
		    public static void guncelle() {
			System.out.println("Güncellendi");
		       }
      //int türünde deðer dödndüren method    
      public static int topla(int sayi1,int sayi2) {
    	  return sayi1+sayi2;
      }
      
      //Variable arguments-->istediðim kadar parametre,argüman göndericek þekilde kullanmak için
      //Buraya gönderdiðimiz sayýlar aslýnda int array gibi çalýþýyor
      public static int topla2(int... sayilar) {
    	  int toplam=0;
    	  for(int sayi:sayilar) {//sayilar aslýnda dizi
    		  toplam+=sayi;
    	  }
    	  return toplam;
      }
      public static String sehirVer() {
    	  return "Ankara";
      }
		    

}

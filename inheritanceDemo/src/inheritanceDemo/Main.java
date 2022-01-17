package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI=new KrediUI();
		//Base ogretmen ve tarýmýn miras aldýðý temel sýnýf.Parametre olarak ikisini de alabiliriz.
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//OgretmenKrediManager'daki kod burada çalýþýr.
	    krediUI.KrediHesapla(new AskerKrediManager());
	
	    
	}

}

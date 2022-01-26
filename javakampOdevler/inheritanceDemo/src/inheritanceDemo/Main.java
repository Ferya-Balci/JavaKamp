package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI=new KrediUI();
		//Base ogretmen ve tar�m�n miras ald��� temel s�n�f.Parametre olarak ikisini de alabiliriz.
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//OgretmenKrediManager'daki kod burada �al���r.
	    krediUI.KrediHesapla(new AskerKrediManager());
	
	    
	}

}

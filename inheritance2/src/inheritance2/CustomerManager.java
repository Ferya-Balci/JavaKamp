package inheritance2;
//Ekranda müþteri iþlemi yapacak olan sýnýf
public class CustomerManager {

	public void add(Logger logger) {
		//Müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		logger.log();
		//logger hepsinin ref tutuyor.kimin ref gönd onun logu çalýþýr.
	}
}

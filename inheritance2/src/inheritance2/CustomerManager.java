package inheritance2;
//Ekranda m��teri i�lemi yapacak olan s�n�f
public class CustomerManager {

	public void add(Logger logger) {
		//M��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		logger.log();
		//logger hepsinin ref tutuyor.kimin ref g�nd onun logu �al���r.
	}
}

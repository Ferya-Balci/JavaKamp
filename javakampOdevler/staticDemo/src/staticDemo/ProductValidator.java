package staticDemo;

public class ProductValidator {
//�r�n� kaydederken,g�ncellerken �r�n kurallara uygun mu kontrol etmek i�in kullan�l�r.

	static {
		System.out.println("Static Yap�c� blok �al��t�.");
	}
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�.");
	}

	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*//inner class
    public static class BaskaBirClass{
    	public static void Sil() {
    		
    	}
    }*/
	
	
	



}

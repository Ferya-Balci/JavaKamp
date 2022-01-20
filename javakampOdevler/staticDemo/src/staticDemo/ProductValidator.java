package staticDemo;

public class ProductValidator {
//ürünü kaydederken,güncellerken ürün kurallara uygun mu kontrol etmek için kullanýlýr.

	static {
		System.out.println("Static Yapýcý blok çalýþtý.");
	}
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
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

package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"Siyah");
		/*product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		*/
		//System.out.println(product.name);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
	}

}

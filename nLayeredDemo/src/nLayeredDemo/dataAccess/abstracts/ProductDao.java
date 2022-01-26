package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	//ürün arama için.id ver,product döndürür
	Product get(int id);
	//listeleme.çok ürün 
	List<Product> getAll();
	
	
}

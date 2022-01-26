package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	//�r�n arama i�in.id ver,product d�nd�r�r
	Product get(int id);
	//listeleme.�ok �r�n 
	List<Product> getAll();
	
	
}

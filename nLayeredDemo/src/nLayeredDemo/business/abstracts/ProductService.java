package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//Ýþ sýnýfýnýn interface'i
public interface ProductService {

	void add(Product product);
	List<Product> getAll();
}

package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {


	//dataacces'e ba�l� ama gev�ek.
	//Hibernate'e de�il onun referans�n� tutan interface'e ba�l�
	private ProductDao productDao;
	
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		//i� kodlar�
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
		    return;
		}
		//if'e girmezse kurallar� sa�l�yor
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

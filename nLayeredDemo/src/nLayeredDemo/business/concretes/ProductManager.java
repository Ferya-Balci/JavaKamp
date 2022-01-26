package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {


	//dataacces'e baðlý ama gevþek.
	//Hibernate'e deðil onun referansýný tutan interface'e baðlý
	private ProductDao productDao;
	
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		//iþ kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
		    return;
		}
		//if'e girmezse kurallarý saðlýyor
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

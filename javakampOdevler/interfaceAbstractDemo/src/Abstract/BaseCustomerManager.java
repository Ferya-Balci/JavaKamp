package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	//ortak operasyon
	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanưna kaydedildi: " +customer.getFirstName());
		
	}

}

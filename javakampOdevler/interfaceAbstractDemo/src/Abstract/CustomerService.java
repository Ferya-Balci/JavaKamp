package Abstract;

import Entities.Customer;

public interface CustomerService {

	//iki firma da müşterileri dbe kaydediyor.
	void save(Customer customer);
}

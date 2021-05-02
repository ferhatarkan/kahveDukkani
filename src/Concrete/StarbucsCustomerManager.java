package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucsCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	public StarbucsCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Save to db:" + customer.getFirstName());
		}
		System.out.println("Not a valid person");
	}

}

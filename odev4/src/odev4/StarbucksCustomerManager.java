package odev4;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {

		if (this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			new Exception("Not a valid person");
		}

	}

}

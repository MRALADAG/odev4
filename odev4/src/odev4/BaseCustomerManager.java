package odev4;

public abstract class BaseCustomerManager implements CustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to Db : " + customer.getFirstName());

	}

}

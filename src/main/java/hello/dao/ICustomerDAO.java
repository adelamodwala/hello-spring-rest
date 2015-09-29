package hello.dao;

import hello.entity.IEmployee;
import hello.entity.IGreeting;

public interface ICustomerDAO {
	String getCustomer();
	
	IEmployee getEmployee(int id);
	
	IGreeting getGreeting();
}

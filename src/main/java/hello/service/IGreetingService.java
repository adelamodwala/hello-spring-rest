package hello.service;

import hello.dao.ICustomerDAO;
import hello.entity.IEmployee;
import hello.entity.IGreeting;

public interface IGreetingService {
	
	ICustomerDAO getCustomerDAO();
	
	void setCustomerDAO(ICustomerDAO customerDAO);
	
	IEmployee getEmployee(int id);
	
	IGreeting getGreeting();
}

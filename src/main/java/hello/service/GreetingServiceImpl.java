package hello.service;

import hello.dao.*;
import hello.entity.IEmployee;
import hello.entity.IGreeting;

public class GreetingServiceImpl implements IGreetingService {
    
    protected ICustomerDAO customerDAO;
    
    public ICustomerDAO getCustomerDAO() {
    	return this.customerDAO;
    }
    
    public void setCustomerDAO(ICustomerDAO customerDAO) {
    	this.customerDAO = customerDAO;
    }
    
    public IEmployee getEmployee(int id) {
    	return this.getCustomerDAO().getEmployee(id);
    }
    
    public IGreeting getGreeting() {
    	return this.getCustomerDAO().getGreeting();
    }
}

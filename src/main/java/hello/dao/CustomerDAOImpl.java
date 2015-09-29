package hello.dao;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import hello.entity.*;

public class CustomerDAOImpl implements ICustomerDAO {
	
	private SessionFactory sessionFactory;
	private String customer;
	private IGreeting greeting;
	
	public String getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public void setGreeting(IGreeting greeting) {
		this.greeting = greeting;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public IEmployee getEmployee(int id) {
		IEmployee employee = (IEmployee) sessionFactory.getCurrentSession()
														.get(Employee.class, id);
		return employee;
	}
	
	@Transactional
	public IGreeting getGreeting() {
		return (IGreeting) this.greeting;
	}
	
}

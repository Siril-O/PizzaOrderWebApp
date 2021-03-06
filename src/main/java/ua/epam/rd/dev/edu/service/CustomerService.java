package ua.epam.rd.dev.edu.service;

import java.util.List;

import ua.epam.rd.dev.edu.domain.Customer;

public interface CustomerService {


	public void save(Customer customer);	
	
	public List<Customer> getAllCustomers();
	
	public Customer findByid(Long id);
	
	public Customer getByEmailAndPassword(String email, String password);
	
	public Customer getByEmail(String email);

}

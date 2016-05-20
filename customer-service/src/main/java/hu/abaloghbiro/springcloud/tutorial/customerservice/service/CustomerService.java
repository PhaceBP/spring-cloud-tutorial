package hu.abaloghbiro.springcloud.tutorial.customerservice.service;

import java.util.List;

import hu.abaloghbiro.springcloud.tutorial.model.Customer;

public interface CustomerService
{
  List<Customer> getCustomers();

  Customer getCustomerByID(Integer customerId);

}

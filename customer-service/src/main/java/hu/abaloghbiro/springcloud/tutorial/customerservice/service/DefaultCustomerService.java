package hu.abaloghbiro.springcloud.tutorial.customerservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.abaloghbiro.springcloud.tutorial.customerservice.dao.CustomerRespository;
import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@Service
public class DefaultCustomerService implements CustomerService
{

  @Autowired
  private CustomerRespository dao;

  public List<Customer> getCustomers()
  {
    Iterable<Customer> iterable = dao.findAll();

    if (iterable instanceof List)
    {
      return (List<Customer>) iterable;
    }
    ArrayList<Customer> list = new ArrayList<Customer>();
    if (iterable != null)
    {
      for (Customer e : iterable)
      {
        list.add(e);
      }
    }
    return list;
  }

  public Customer getCustomerByID(Integer customerId)
  {
    return dao.findOne(customerId);
  }

}

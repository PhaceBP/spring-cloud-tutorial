package hu.abaloghbiro.springcloud.tutorial.customerservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.abaloghbiro.springcloud.tutorial.customerservice.service.CustomerService;
import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@RestController
public class CustomerServiceController
{

  @Autowired
  private CustomerService custService;

  @RequestMapping(value = "/customers", method = RequestMethod.GET)
  public List<Customer> getCustomers()
  {
    return custService.getCustomers();
  }

  @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
  public Customer getCustomerById(@PathVariable("customerId") Integer customerId)
  {
    return custService.getCustomerByID(customerId);
  }

}

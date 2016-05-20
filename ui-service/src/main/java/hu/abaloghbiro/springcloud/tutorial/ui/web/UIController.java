package hu.abaloghbiro.springcloud.tutorial.ui.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.abaloghbiro.springcloud.tutorial.client.CustomerServiceFeignClient;
import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@RestController
public class UIController
{

  @Autowired
  private CustomerServiceFeignClient client;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Customer> getCustomers()
  {
    List<Customer> customers = this.client.getCustomers();
    for (Customer c : customers)
    {
      System.out.println(c);
      c.setLastName(c.getLastName() + "_MODIFIED");
    }

    return customers;
  }
}

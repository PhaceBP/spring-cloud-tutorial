package hu.abaloghbiro.springcloud.tutorial.customerservice.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import hu.abaloghbiro.springcloud.tutorial.customerservice.dao.CustomerRespository;
import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@Component
public class CustomerLoader implements ApplicationListener<ContextRefreshedEvent>
{

  private CustomerRespository customerRepository;

  @Autowired
  public void setProductRepository(CustomerRespository customerRepository)
  {
    this.customerRepository = customerRepository;
  }

  public void onApplicationEvent(ContextRefreshedEvent event)
  {

    Customer customer = new Customer();
    customer.setFirstName("Attila");
    customer.setLastName("Balogh-Biro");
    customer.setAddress("Budapest");
    customer.setEmailAddress("abaloghbiro@protonmail.com");

    customerRepository.save(customer);

    Customer customer2 = new Customer();
    customer2.setFirstName("Elek");
    customer2.setLastName("Tibor");
    customer2.setAddress("Szeged");
    customer2.setEmailAddress("elek.tibor@gmail.com");

    customerRepository.save(customer2);

  }

}
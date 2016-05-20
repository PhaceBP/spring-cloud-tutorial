package hu.abaloghbiro.springcloud.tutorial.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@FeignClient("customer-service")
public interface CustomerServiceFeignClient
{

  @RequestMapping(method = RequestMethod.GET, value = "/customers")
  List<Customer> getCustomers();

  @RequestMapping(method = RequestMethod.GET, value = "/customers/{customerId}")
  Customer getCustomerByID(@PathVariable("customerId") Integer customerId);

}

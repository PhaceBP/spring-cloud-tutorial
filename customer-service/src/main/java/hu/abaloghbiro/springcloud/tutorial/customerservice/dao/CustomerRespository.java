package hu.abaloghbiro.springcloud.tutorial.customerservice.dao;

import org.springframework.data.repository.CrudRepository;

import hu.abaloghbiro.springcloud.tutorial.model.Customer;

public interface CustomerRespository extends CrudRepository<Customer, Integer>
{

}

package hu.abaloghbiro.springcloud.tutorial.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import hu.abaloghbiro.springcloud.tutorial.model.Customer;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "hu.abaloghbiro.springcloud.tutorial.customerservice.dao")
@ComponentScan("hu.abaloghbiro.springcloud")
@EntityScan(basePackageClasses = Customer.class)
public class App
{
  public static void main(String[] args)
  {
    SpringApplication.run(App.class, args);
  }
}
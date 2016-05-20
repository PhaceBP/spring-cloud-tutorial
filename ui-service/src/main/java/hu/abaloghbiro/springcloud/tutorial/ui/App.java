package hu.abaloghbiro.springcloud.tutorial.ui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import hu.abaloghbiro.springcloud.tutorial.client.CustomerServiceFeignClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = CustomerServiceFeignClient.class)
@ComponentScan("hu.abaloghbiro.springcloud")
public class App
{

  public static void main(String[] args)
  {
    new SpringApplicationBuilder(App.class).web(true).run(args);
  }
}
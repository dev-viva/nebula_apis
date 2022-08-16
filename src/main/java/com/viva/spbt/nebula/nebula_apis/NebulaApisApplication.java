package com.viva.spbt.nebula.nebula_apis;

import com.viva.spbt.nebula.nebula_apis.controllers.rest.customer.Customer;
import com.viva.spbt.nebula.nebula_apis.controllers.rest.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NebulaApisApplication {

    private static final Logger log = LoggerFactory.getLogger(NebulaApisApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NebulaApisApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            //Save a few customers
            repository.save(new Customer("Vijish", "Varghese"));
            repository.save(new Customer("Milu", "Mathew"));
            repository.save(new Customer("Hannah", "Alphonsa"));
            repository.save(new Customer("Matthew", "Joseph"));
            repository.save(new Customer("Hallie", "Beth"));

            //Fetch All Customers
            log.info("Customers fournd with findAll():");
            log.info("--------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");
            //Fetch An Individual Customer by ID
            Customer customer = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
            //Fetch Customers By Last Name
            log.info("Customer foudn with findByLastName(\"Beth\"):");
            log.info("--------------------------------");
            repository.findByLastName("Beth").forEach(beth -> {
                log.info(beth.toString());
            });
            //for(Customer beth : repository.findByLastName("Beth")){
            //log.info(beth.toString());
            //}
            log.info("");
        };
    }
}

package com.example.demo.data.models;

import com.example.demo.data.repository.CustomerFakeRepository;
import com.example.demo.data.repository.CustomerRepo;
import com.example.demo.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command line runner hooray");
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        return useFakeCustomerRepo ?
                new CustomerFakeRepository() :
                new CustomerRepository();
    }
}

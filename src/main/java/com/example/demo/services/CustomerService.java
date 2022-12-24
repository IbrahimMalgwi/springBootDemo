package com.example.demo.services;

import com.example.demo.data.models.Customer;
import com.example.demo.data.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

   public List<Customer> getCustomer(){
       return customerRepo.getCustomers();
   }
}

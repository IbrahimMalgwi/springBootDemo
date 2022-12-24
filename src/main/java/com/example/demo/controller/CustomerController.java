package com.example.demo.controller;

import com.example.demo.data.models.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService) {
       this.customerService = customerService;
    }

    @GetMapping("/customer")
    List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

}

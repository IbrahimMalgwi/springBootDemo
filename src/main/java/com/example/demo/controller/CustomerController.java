package com.example.demo.controller;

import com.example.demo.data.models.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/customer")
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping("/customer")
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
    }

}

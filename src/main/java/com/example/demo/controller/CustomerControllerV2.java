package com.example.demo.controller;

import com.example.demo.data.models.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("api/v2/customer")
@RestController
public class CustomerControllerV2 {
    private final CustomerService customerService;

    @Autowired
    CustomerControllerV2(CustomerService customerService) {
       this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer(){
        return Arrays.asList(
                new Customer(0L, "v2", "v2")
        );
    }

    @PostMapping(value = "all")
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping(value = "all")
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
    }

}

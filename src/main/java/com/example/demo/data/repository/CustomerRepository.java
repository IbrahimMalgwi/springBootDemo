package com.example.demo.data.repository;

import com.example.demo.data.models.Customer;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        //TODO connect to real db
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db", "todo")
        );
    }
}

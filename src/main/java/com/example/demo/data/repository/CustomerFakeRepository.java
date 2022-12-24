package com.example.demo.data.repository;

import com.example.demo.data.models.Customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Racheal James", "password123"),
                new Customer(2L, "Banke Bolaji", "123password")
        );
    }
}

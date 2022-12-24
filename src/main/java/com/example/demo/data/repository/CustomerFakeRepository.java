package com.example.demo.data.repository;

import com.example.demo.data.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Racheal James"),
                new Customer(2L, "Banke Bolaji")
        );
    }
}

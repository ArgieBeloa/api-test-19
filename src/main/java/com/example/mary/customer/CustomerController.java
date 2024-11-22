package com.example.mary.customer;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    //    create data
    private static  final List<Customer> CUSTOMERS = List.of(
            new Customer("Math", "1 + 1", "2"),
            new Customer("Math", "2 + 2", "4")
    );

    //    get all data
    @GetMapping
    public List<Customer> findAllCustomers(){

        return CUSTOMERS;
    }

}


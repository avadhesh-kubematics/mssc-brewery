package com.kubematics.msscbrewery.web.controller;


import com.kubematics.msscbrewery.web.model.CustomerDto;
import com.kubematics.msscbrewery.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    private CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    @GetMapping("/{customerid}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerid") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

}
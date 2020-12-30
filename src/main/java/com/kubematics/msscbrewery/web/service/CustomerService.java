package com.kubematics.msscbrewery.web.service;

import com.kubematics.msscbrewery.web.model.CustomerDto;

import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}

package com.kubematics.msscbrewery.web.service;

import com.kubematics.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Avadhesh")
                .build();
    }
}

package com.prashantjain.yummyrest.mapper;

import com.prashantjain.yummyrest.dto.CustomerRequest;
import com.prashantjain.yummyrest.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .city(request.city())
                .pincode(request.pincode())
                .email(request.email())
                .password(request.password())
                .build();
    }
}

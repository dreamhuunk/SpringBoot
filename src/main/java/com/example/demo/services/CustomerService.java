package com.example.demo.services;

import java.util.UUID;

import com.example.demo.web.model.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getCustomerById(UUID customerID);

}

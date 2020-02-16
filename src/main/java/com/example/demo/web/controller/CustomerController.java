package com.example.demo.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CustomerService;
import com.example.demo.web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController 
{
	CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/{customer_id}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customer_id") UUID customerID)
	{
		return new ResponseEntity<>(customerService.getCustomerById(customerID),HttpStatus.OK);
	}

}

package com.example.demo.services;

import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.Builder;

import com.example.demo.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerID) {
		// TODO Auto-generated method stub
			return CustomerDto.builder().customerID(UUID.randomUUID()).firstName("Ally").lastName("Sobers").build();
	}

}

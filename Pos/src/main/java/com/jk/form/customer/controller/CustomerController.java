package com.jk.form.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk.form.customer.repository.CustomerRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/fetchingCustomerDetails")
	public ResponseEntity<?> fetchingCustomerDetails() {

		return ResponseEntity.ok(customerRepository.findAll());

//		if (null != customerRequest && customerRequest.getId() > 0l)
//			return ResponseEntity.ok(customerRepository.getOne(customerRequest.getId()));
//		else
//			return ResponseEntity.ok(customerRepository.findAll());
	}

}

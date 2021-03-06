package web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.CustomerService;
import web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService ) {
		this.customerService = customerService;
	}
	
	@GetMapping({"/{custmerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("custmerId") UUID custId) {
		return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
	}

}

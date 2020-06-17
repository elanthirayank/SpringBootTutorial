package services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override	
	public CustomerDto getCustomerById(UUID custId) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.customerName("Komugilan")
				.build();
	}

}

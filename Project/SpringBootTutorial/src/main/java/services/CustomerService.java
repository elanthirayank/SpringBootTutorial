package services;

import java.util.UUID;

import web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID custId);

}

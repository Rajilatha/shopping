package com.example.shopping.service;

import com.example.shopping.model.Address;

public interface AddressService {

	boolean saveAddress(Address address);
	Address findAddressByBilling(boolean billing);

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.controller;

import edu.layered.dto.CustomerDto;
import edu.layered.service.ServiceFactory;
import edu.layered.service.custom.CustomerService;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerController {
 
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String save(CustomerDto customerDto) throws Exception{
        return customerService.saveCustomer(customerDto);
    }
}

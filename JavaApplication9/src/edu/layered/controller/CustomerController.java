/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.controller;

import edu.layered.dto.CustomerDto;
import edu.layered.service.ServiceFactory;
import edu.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerController {
 
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String save(CustomerDto customerDto) throws Exception{
        return customerService.saveCustomer(customerDto);
    }
    
    public String update(CustomerDto customerDto) throws Exception{
        return customerService.UpdateCustomer(customerDto);
    }
    
    public String delete(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto get(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public ArrayList<CustomerDto> getAll() throws Exception{
        return customerService.getAll();
    }
}

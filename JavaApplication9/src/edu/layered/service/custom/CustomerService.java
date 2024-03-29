/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.layered.service.custom;


import edu.layered.dto.CustomerDto;
import edu.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public interface CustomerService extends SuperService{
    String saveCustomer(CustomerDto customeDto) throws Exception;
    String UpdateCustomer(CustomerDto customeDto) throws Exception;
    String deleteCustomer(String customeCode) throws Exception;
    CustomerDto getCustomer(String customerCode) throws Exception;
    ArrayList<CustomerDto> getAll() throws Exception;
}

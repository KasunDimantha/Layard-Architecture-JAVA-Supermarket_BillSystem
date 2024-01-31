/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.service.custom.impl;


import edu.layered.dao.DaoFactory;
import edu.layered.dto.CustomerDto;
import edu.layered.entity.CustomerEntity;
import edu.layered.dao.custom.CustomerDao;
import edu.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        
        if (customerDao.add(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String UpdateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(), dto.getTitle(),
                dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        if (entity != null) {
            return new CustomerDto(entity.getCustId(),
                    entity.getTitle(), entity.getName(), entity.getDob(),
                    entity.getSalary(), entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip());
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(entity.getCustId(),
                    entity.getTitle(), entity.getName(), entity.getDob(),
                    entity.getSalary(), entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip()));
        }
        return customerDtos;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.service;

import edu.layered.service.custom.impl.CustomerServiceImpl;
import edu.layered.service.custom.impl.ItemServiceImpl;
import edu.layered.service.custom.impl.OrderServiceImpl;

/**
 *
 * @author tharidu dilshan
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){
        
    }
    
    public static ServiceFactory getInstance() {
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType) {
        switch (serviceType) {
            case ITEM:
              return new ItemServiceImpl();
            case CUSTOMER:
              return new CustomerServiceImpl();
            case ORDER:
              return new OrderServiceImpl();
            default:
                return null;
        }
    }
    
    
    public enum ServiceType{
        ITEM, CUSTOMER, ORDER;
    }
}

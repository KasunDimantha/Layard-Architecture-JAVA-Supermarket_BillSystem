/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.controller;

import edu.layered.dto.OrderDto;
import edu.layered.service.ServiceFactory;
import edu.layered.service.custom.OrderService;

/**
 *
 * @author tharidu dilshan
 */
public class OrderController {
    
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto dto) throws Exception{
        return orderService.placeOrder(dto);
    }
    
}

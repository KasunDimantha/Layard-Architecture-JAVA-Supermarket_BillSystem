/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.layered.service.custom;

import edu.layered.dto.OrderDto;
import edu.layered.service.SuperService;

/**
 *
 * @author tharidu dilshan
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDto dto) throws Exception;
}

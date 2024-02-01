/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.dto;

import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class OrderDto {
    private String orderId;
    private String date;
    private String custId;
    
    private ArrayList<OrderDetailDto> orderDetailDto;

    public OrderDto() {
    }

    public OrderDto(String orderId, String date, String custId, ArrayList<OrderDetailDto> orderDetailDto) {
        this.orderId = orderId;
        this.date = date;
        this.custId = custId;
        this.orderDetailDto = orderDetailDto;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderDetailDto
     */
    public ArrayList<OrderDetailDto> getOrderDetailDto() {
        return orderDetailDto;
    }

    /**
     * @param orderDetailDto the orderDetailDto to set
     */
    public void setOrderDetailDto(ArrayList<OrderDetailDto> orderDetailDto) {
        this.orderDetailDto = orderDetailDto;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", date=" + date + ", custId=" + custId + ", orderDetailDto=" + orderDetailDto + '}';
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.dao.custom.impl;

import edu.layered.dao.CrudUtil;
import edu.layered.dao.custom.OrderDao;
import edu.layered.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orders VALUES(?,?,?)", 
                t.getOrderId(),
                t.getDate(),
                t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

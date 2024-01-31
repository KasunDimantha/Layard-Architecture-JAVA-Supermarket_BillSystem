/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.dao.custom.impl;

import edu.layered.dao.CrudUtil;
import edu.layered.dao.custom.CustomerDao;
import edu.layered.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)", 
                t.getCustId(),
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET CustTitle=?, CustName=?, DOB=?, salary=?, CustAddress=?, City=? , Province=?, PostalCode=? WHERE CustID=?",                
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getZip(),
                t.getCustId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT *FROM customer WHERE CustID=?", id);
        
        while(rst.next()) {
            return new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode"));
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT *FROM customer");
        
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode")));
        }

        return customerEntities;
        
    }
    
}

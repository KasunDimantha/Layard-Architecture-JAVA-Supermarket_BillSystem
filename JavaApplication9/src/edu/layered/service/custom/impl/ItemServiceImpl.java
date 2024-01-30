/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.service.custom.impl;

import edu.layered.dto.ItemDto;
import edu.layered.entity.ItemEntity;
import edu.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class ItemServiceImpl implements ItemService{

    @Override
    public String saveItem(ItemDto dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(
                dto.getItemCode(), 
                dto.getDescription(), 
                dto.getPackSize(), 
                dto.getUnitPrice(), 
                dto.getQoh());
        
        return null;
    }

    @Override
    public String UpdateItem(ItemDto itemDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteItem(String itemCode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ItemDto getItem(String itemCode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

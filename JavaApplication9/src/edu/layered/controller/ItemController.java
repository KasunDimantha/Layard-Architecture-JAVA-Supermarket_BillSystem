/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.controller;

import edu.layered.dto.ItemDto;
import edu.layered.service.ServiceFactory;
import edu.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String save(ItemDto itemDto) throws Exception{
        return itemService.saveItem(itemDto);
    }
    
    public String update(ItemDto itemDto) throws Exception{
        return itemService.UpdateItem(itemDto);
    }
    
    public String delete(String itemId) throws Exception{
        return itemService.deleteItem(itemId);
    }
    
    public ItemDto get(String itemId) throws Exception{
        return itemService.getItem(itemId);
    }
    
    public ArrayList<ItemDto> getAll(ItemDto itemDto) throws Exception{
        return itemService.getAll();
    }
    
}

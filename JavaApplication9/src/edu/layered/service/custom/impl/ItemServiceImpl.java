/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.service.custom.impl;

import edu.layered.dao.DaoFactory;
import edu.layered.dao.custom.ItemDao;
import edu.layered.dto.ItemDto;
import edu.layered.entity.ItemEntity;
import edu.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class ItemServiceImpl implements ItemService{
    
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(
                dto.getItemCode(), 
                dto.getDescription(), 
                dto.getPackSize(), 
                dto.getUnitPrice(), 
                dto.getQoh());
        
        if(itemDao.add(itemEntity)){
            return "Successfully Saved";
        } else{
            return "Fail";
        }
    }

    @Override
    public String UpdateItem(ItemDto dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(
                dto.getItemCode(), 
                dto.getDescription(), 
                dto.getPackSize(), 
                dto.getUnitPrice(), 
                dto.getQoh());
        
        if(itemDao.add(itemEntity)){
            return "Successfully Updated";
        } else{
            return "Fail";
        }
    }

    @Override
    public String deleteItem(String itemCode) throws Exception {
        if (itemDao.delete(itemCode)){
            return "Successfully Deleted";
        } else{
            return "Fail";
        }
    }

    @Override
    public ItemDto getItem(String itemCode) throws Exception {
        ItemEntity itemEntity = itemDao.get(itemCode);
        return new ItemDto(
                itemEntity.getItemCode(),
                itemEntity.getDescription(),
                itemEntity.getPackSize(),
                itemEntity.getUnitPrice(),
                itemEntity.getQoh());
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntities = itemDao.getAll();

        ArrayList<ItemDto> itemDtos = new ArrayList<>();

        for (ItemEntity itemEntity : itemEntities) {
            itemDtos.add(new ItemDto(
                itemEntity.getItemCode(),
                itemEntity.getDescription(),
                itemEntity.getPackSize(),
                itemEntity.getUnitPrice(),
                itemEntity.getQoh()));
        }
        return itemDtos;
    }
    
    
}

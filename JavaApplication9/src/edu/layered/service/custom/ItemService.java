/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.layered.service.custom;

import edu.layered.dto.ItemDto;
import edu.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public interface ItemService extends SuperService{
    String saveItem(ItemDto itemDto) throws Exception;
    String UpdateItem(ItemDto itemDto) throws Exception;
    String deleteItem(String itemCode) throws Exception;
    ItemDto getItem(String itemCode) throws Exception;
    ArrayList<ItemDto> getAll() throws Exception;
}

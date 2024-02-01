/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.service.custom.impl;

import edu.layered.dao.DaoFactory;
import edu.layered.dao.custom.ItemDao;
import edu.layered.dao.custom.OrderDao;
import edu.layered.dao.custom.OrderDetailDao;
import edu.layered.db.DBConnection;
import edu.layered.dto.OrderDetailDto;
import edu.layered.dto.OrderDto;
import edu.layered.entity.ItemEntity;
import edu.layered.entity.OrderDetailEntity;
import edu.layered.entity.OrderEntity;
import edu.layered.service.custom.OrderService;
import java.sql.Connection;

/**
 *
 * @author tharidu dilshan
 */
public class OrderServiceImpl implements OrderService{
    
    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetaiDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto dto) throws Exception {
        return null;
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            OrderEntity orderEntity = new OrderEntity(dto.getOrderId(), dto.getDate(), dto.getCustId());
            if (orderDao.add(orderEntity)) {

                boolean isOrderDetailsSaved = true;

                for (OrderDetailDto odd : dto.getOrderDetailDto()) {
                    if (!orderDetaiDao.add(new OrderDetailEntity(
                            dto.getOrderId(), 
                            odd.getItemId(), 
                            odd.getQty(), 
                            odd.getDiscount()))) {
                        isOrderDetailsSaved = false;
                    }
                }

                if (isOrderDetailsSaved) {

                    boolean isItemUpdated = true;

                    for (OrderDetailDto odd : dto.getOrderDetailDto()) {
                        ItemEntity itemEntity = itemDao.get(odd.getItemId().toString());
                        if(itemEntity != null){
                            itemEntity.setQoh(itemEntity.getQoh() - odd.getQty());
                            if(!itemDao.update(itemEntity)){
                                isItemUpdated = false;
                            }
                        }
                    }

                    if(isItemUpdated){
                        connection.commit();
                        return "Success";
                    } else{
                        connection.rollback();
                        return "Item update Error";
                    }

                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    
}

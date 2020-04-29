package by.jrr.service;

import by.jrr.bean.Order;
import by.jrr.dao.OrderDao;
import by.jrr.exception.DatabaseException;
import by.jrr.exception.MyException;

import java.sql.SQLException;

public class OrderService {
    OrderDao orderDao;

    public boolean placeOrder(Order order) throws DatabaseException {
        try {
            int result = orderDao.create(order);
            if (result == 1) {
                return true;
            }
        }catch (SQLException e) {
            throw new DatabaseException(e.toString());
        }
        return false;
    }
    public boolean cancelOrder(int id) throws  MyException {
        try {
            Order order = orderDao.read(id);
            if (order != null) {
                order.setStatus("Canceled");
                int i = orderDao.update(order);
                if (i == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }catch (SQLException e) {
            throw new MyException(e.toString());
        }
    }
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}

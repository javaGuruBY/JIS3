package by.jrr.dao;

import by.jrr.bean.Order;

import java.sql.SQLException;

public class OrderDao {
    public int create(Order order) throws SQLException {
        return 0;
    }
    public Order read(int i) throws SQLException {
        return new Order();
    }
    public int update(Order order) throws SQLException {
        return 0;
    }
    public void delete() throws SQLException {

    }
}

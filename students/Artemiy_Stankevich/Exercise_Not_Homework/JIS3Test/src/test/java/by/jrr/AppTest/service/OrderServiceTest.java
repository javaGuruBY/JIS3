package by.jrr.AppTest.service;

import by.jrr.bean.Order;
import by.jrr.dao.OrderDao;
import by.jrr.exception.DatabaseException;
import by.jrr.exception.MyException;
import by.jrr.service.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {
    public static final int SUCCESS_SQL = 1;
    public static final int FAILED_SQL = 0;
    OrderService orderService;

    @Mock
    OrderDao orderDao;

    @Before
    public void  setUp() {
        MockitoAnnotations.initMocks(this);
        orderService = new OrderService(orderDao);
    }

    @Test
    public void placeOrderTestShouldCreateAnOrder() throws SQLException, MyException, DatabaseException {
        when(orderDao.create(any(Order.class))).thenReturn(SUCCESS_SQL);
        boolean actual = orderService.placeOrder(any(Order.class));
        verify(orderDao).create(any(Order.class));
        assertTrue(actual);
    }
    @Test
    public void placeOrderTestShouldNotCreateAnOrder() throws SQLException, MyException, DatabaseException {
        when(orderDao.create(any(Order.class))).thenReturn(FAILED_SQL);
        boolean actual = orderService.placeOrder(any(Order.class));
        verify(orderDao).create(any(Order.class));
        assertFalse(actual);
    }
    @Test(expected = MyException.class)
    public void placeOrderTestShouldThrowException() throws SQLException, MyException, DatabaseException {
        when(orderDao.create(any(Order.class))).thenThrow(MyException.class);
        orderService.placeOrder(any(Order.class));
    }
    @Test
    public void cancelOrderShouldCancelOrder() throws SQLException, MyException, DatabaseException {
        when(orderDao.read(anyInt())).thenReturn(new Order());
        when(orderDao.update(any(Order.class))).thenReturn(SUCCESS_SQL);

        boolean actual = orderService.cancelOrder(anyInt());

        verify(orderDao).read(anyInt());
        verify(orderDao).update(any(Order.class));
        assertTrue(actual);
    }
}

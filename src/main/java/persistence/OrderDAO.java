package persistence;

import domain.Order;

import java.util.List;

public interface OrderDAO {
    List<Order> getOrdersByUsername(String username);

    Order getOrder(int orderId);

    void insertOrder(Order order);

    void insertOrderStatus(Order order);

    void setOrderId(Order order);
}

package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Order;
import service.OrderService;

public class NewOrderAction extends ActionSupport {
    private OrderService service;
    private Order order;

    public NewOrderAction(){service=new OrderService();}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String execute() throws Exception {
        service.insertOrder(order);
        return SUCCESS;
    }
}

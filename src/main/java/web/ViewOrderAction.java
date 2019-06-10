package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Order;
import service.OrderService;

public class ViewOrderAction extends ActionSupport {
    private OrderService service;
    private Order order;

    public ViewOrderAction(){service=new OrderService();}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String execute() throws Exception {
        order=service.getOrder(order.getOrderId());
        if (order==null)
            return ERROR;
        return SUCCESS;
    }
}

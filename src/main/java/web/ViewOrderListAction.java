package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Order;
import service.OrderService;

import java.util.List;

public class ViewOrderListAction extends ActionSupport {

    private OrderService orderService;
    private String username;
    private List<Order> orderList;

    public ViewOrderListAction(){orderService=new OrderService();}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String execute() throws Exception {
        orderList=orderService.getOrdersByUsername(username);
        return SUCCESS;
    }
}

package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Order;
import service.OrderService;

import java.util.List;

public class ListOrdersAction extends ActionSupport {
    List<Order> orderList;
    OrderService orderService;
    Account account;

    public ListOrdersAction(){
        orderService=new OrderService();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String execute() throws Exception {
        orderList = orderService.getOrdersByUsername(account.getUsername());
        return SUCCESS;
    }
}

package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Order;
import service.AccountService;
import service.OrderService;

import java.util.List;

public class ListOrdersAction extends ActionSupport {

    private Account account;
    private AccountService accountService;
    List<Order> orderList;
    OrderService orderService;

    public ListOrdersAction(){
        accountService=new AccountService();
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
        if (account!=null)
            account=accountService.getAccount(account.getUsername());
        orderList = orderService.getOrdersByUsername(account.getUsername());
        return SUCCESS;
    }
}

package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Order;
import service.AccountService;
import service.OrderService;

import java.util.List;

public class ViewOrderListAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private OrderService orderService;
    private String username;
    private List<Order> orderList;

    public ViewOrderListAction(){
        accountService=new AccountService();
        orderService=new OrderService();}

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
        orderList=orderService.getOrdersByUsername(username);
        return SUCCESS;
    }
}

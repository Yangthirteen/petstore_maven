package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Order;
import service.AccountService;
import service.OrderService;

public class NewOrderAction extends ActionSupport {

    private AccountService accountService;
    private Account account;
    private OrderService service;
    private Order order;

    public NewOrderAction(){
        accountService=new AccountService();
        service=new OrderService();}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
        service.insertOrder(order);
        return SUCCESS;
    }
}

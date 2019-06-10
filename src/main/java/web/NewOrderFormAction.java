package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.Account;
import domain.Cart;
import domain.Order;
import service.OrderService;

public class NewOrderFormAction extends ActionSupport {

    private Order order;
    private Account account;
    private String message;
    private Cart cart;
    private OrderService orderService;

    public NewOrderFormAction(){orderService=new OrderService();}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception {
        if (account == null) {
            message="You must sign on before attempting to check out.  Please sign on and try checking out again.";
        } else if (cart != null) {
            order=new Order();
            order.initOrder(account, cart);
        } else {
            message="An order could not be created because a cart could not be found.";
        }
        return SUCCESS;
    }
}
